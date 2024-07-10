@file:Suppress("ktlint")
package gg.jte.generated.ondemand
import com.rocketsolutions.htmxshop.adapters.database.ProductRepository.Product
@Suppress("UNCHECKED_CAST", "UNUSED_PARAMETER")
class JtelistGenerated {
companion object {
	@JvmField val JTE_NAME = "list.kte"
	@JvmField val JTE_LINE_INFO = intArrayOf(0,0,0,2,2,2,2,2,6,6,6,6,15,15,15,15,15,15,15,15,15,22,22,25,25,25,25,25,2,3,4,4,4,4,4)
	@JvmStatic fun render(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, query:String?, products:List<Product>, basketCount:Int) {
		jteOutput.writeContent("\n")
		gg.jte.generated.ondemand.JteappGenerated.render(jteOutput, jteHtmlInterceptor, object : gg.jte.html.HtmlContent {
			override fun writeTo(jteOutput:gg.jte.html.HtmlTemplateOutput) {
				jteOutput.writeContent("\n    <div class=\"container mt-4\">\n        <h1 class=\"mb-4\">Welcome to Turtle Treasures</h1>\n        <p class=\"lead\">Discover our amazing selection of turtle-friendly products!</p>\n\n        <form class=\"mt-3 mb-3\" hx-target=\"#product-list\">\n            <div class=\"input-group\">\n                <input\n                        hx-post=\"/search\" hx-trigger=\"input changed delay:200ms\"\n                        type=\"text\" class=\"form-control\" placeholder=\"Search for turtle products...\" name=\"q\"")
				val __jte_html_attribute_0 = query
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
					jteOutput.writeContent(" value=\"")
					jteOutput.setContext("input", "value")
					jteOutput.writeUserContent(__jte_html_attribute_0)
					jteOutput.setContext("input", null)
					jteOutput.writeContent("\"")
				}
				jteOutput.writeContent("\n                       aria-label=\"Search for turtle products\" w-tid=\"29\">\n                <button class=\"btn btn-outline-secondary\" type=\"submit\" w-tid=\"30\">Search</button>\n            </div>\n        </form>\n\n        <div class=\"row row-cols-1 row-cols-md-2 row-cols-lg-3 g-4\" id=\"product-list\">\n            ")
				gg.jte.generated.ondemand.component.JteproductlistGenerated.render(jteOutput, jteHtmlInterceptor, products);
				jteOutput.writeContent("\n        </div>\n    </div>\n")
			}
		}, basketCount);
	}
	@JvmStatic fun renderMap(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, params:Map<String, Any?>) {
		val query = params["query"] as String?
		val products = params["products"] as List<Product>
		val basketCount = params["basketCount"] as Int
		render(jteOutput, jteHtmlInterceptor, query, products, basketCount);
	}
}
}
