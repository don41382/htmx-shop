@file:Suppress("ktlint")
package gg.jte.generated.ondemand
import com.rocketsolutions.htmxshop.web.IndexController
import gg.jte.Content
@Suppress("UNCHECKED_CAST", "UNUSED_PARAMETER")
class JteappGenerated {
companion object {
	@JvmField val JTE_NAME = "app.kte"
	@JvmField val JTE_LINE_INFO = intArrayOf(0,0,0,1,3,3,3,3,3,38,38,38,38,38,39,39,39,44,44,44,53,53,53,3,4,4,4,4,4)
	@JvmStatic fun render(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, content:Content, basketCount:Int) {
		jteOutput.writeContent("\n<!doctype html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"utf-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n    <title>Bootstrap demo</title>\n    <link href=\"webjars/bootstrap/5.3.3/css/bootstrap.min.css\" rel=\"stylesheet\">\n    <script src=\"webjars/htmx.org/2.0.2/dist/htmx.min.js\"></script>\n    <script src=\"webjars/bootstrap/5.3.3/js/bootstrap.bundle.min.js\"></script>\n</head>\n<body>\n<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n    <div class=\"container\">\n        <a class=\"navbar-brand\" href=\"#\">🐢 Turtle Treasures</a>\n        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\"\n                aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n            <span class=\"navbar-toggler-icon\"></span>\n        </button>\n        <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n            <ul class=\"navbar-nav me-auto\">\n                <li class=\"nav-item\">\n                    <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">Home</a>\n                </li>\n                <li class=\"nav-item\">\n                    <a class=\"nav-link\" href=\"#\">About</a>\n                </li>\n                <li class=\"nav-item\">\n                    <a class=\"nav-link\" href=\"#\">Contact</a>\n                </li>\n            </ul>\n            <a href=\"#\" class=\"btn btn-outline-success\">\n                <i class=\"bi bi-cart\"></i> Cart\n                <span hx-get=\"/basketCount\" hx-trigger=\"")
		jteOutput.setContext("span", "hx-trigger")
		jteOutput.writeUserContent(IndexController.TRIGGER_BASKET_REFRESH_EVENT)
		jteOutput.setContext("span", null)
		jteOutput.writeContent(" from:body\"\n                      class=\"badge bg-success\">")
		jteOutput.setContext("span", null)
		jteOutput.writeUserContent(basketCount)
		jteOutput.writeContent("</span>\n            </a>\n        </div>\n    </div>\n</nav>\n")
		jteOutput.setContext("body", null)
		jteOutput.writeUserContent(content)
		jteOutput.writeContent("\n<footer class=\"bg-light mt-5 py-3\">\n    <div class=\"container text-center\">\n        <p>&copy; 2023 Turtle Treasures. All rights reserved.</p>\n        <p><a href=\"#\">Privacy Policy</a> | <a href=\"#\">Terms of Service</a></p>\n    </div>\n</footer>\n</body>\n</html>\n")
	}
	@JvmStatic fun renderMap(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, params:Map<String, Any?>) {
		val content = params["content"] as Content
		val basketCount = params["basketCount"] as Int
		render(jteOutput, jteHtmlInterceptor, content, basketCount);
	}
}
}
