@file:Suppress("ktlint")
package gg.jte.generated.ondemand.component
import com.rocketsolutions.htmxshop.adapters.database.ProductRepository.Product
@Suppress("UNCHECKED_CAST", "UNUSED_PARAMETER")
class JteproductlistGenerated {
companion object {
	@JvmField val JTE_NAME = "component/productlist.kte"
	@JvmField val JTE_LINE_INFO = intArrayOf(0,0,0,2,2,2,2,2,6,6,6,9,9,9,9,9,9,9,9,9,11,11,11,12,12,12,13,13,13,14,14,14,14,19,19,21,22,22,22,2,2,2,2,2)
	@JvmStatic fun render(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, products:List<Product>) {
		jteOutput.writeContent("\n\n\n")
		for (p in products) {
			jteOutput.writeContent("\n    <div class=\"col\">\n        <div class=\"card product-card\">\n            <img")
			val __jte_html_attribute_0 = p.imageUrl
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
				jteOutput.writeContent(" src=\"")
				jteOutput.setContext("img", "src")
				jteOutput.writeUserContent(__jte_html_attribute_0)
				jteOutput.setContext("img", null)
				jteOutput.writeContent("\"")
			}
			jteOutput.writeContent(" class=\"card-img-top\" alt=\"Cozy Turtle Tank\">\n            <div class=\"card-body\">\n                <h5 class=\"card-title\">")
			jteOutput.setContext("h5", null)
			jteOutput.writeUserContent(p.title)
			jteOutput.writeContent("</h5>\n                <p class=\"card-text\">")
			jteOutput.setContext("p", null)
			jteOutput.writeUserContent(p.description)
			jteOutput.writeContent("</p>\n                <p class=\"card-text\"><strong>")
			jteOutput.setContext("strong", null)
			jteOutput.writeUserContent(p.price)
			jteOutput.writeContent("</strong></p>\n                <a hx-get=\"/addToBasket/")
			jteOutput.setContext("a", "hx-get")
			jteOutput.writeUserContent(p.id.toString())
			jteOutput.setContext("a", null)
			jteOutput.writeContent("\" hx-swap=\"none\" class=\"btn btn-primary\">Add to\n                    Cart</a>\n            </div>\n        </div>\n    </div>\n")
		}
		jteOutput.writeContent("\n\n")
		jteOutput.writeContent("\n")
	}
	@JvmStatic fun renderMap(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, params:Map<String, Any?>) {
		val products = params["products"] as List<Product>
		render(jteOutput, jteHtmlInterceptor, products);
	}
}
}
