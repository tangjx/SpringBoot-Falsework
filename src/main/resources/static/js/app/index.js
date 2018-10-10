$(document).ready(function(){

    // $(".sidebar-menu").append("<li class=\"active\"><a href=\"#\"><i class=\"fa fa-link\"></i> <span>Link</span></a></li>\n" +
    //     "\n" +
    //     "        <li><a href=\"#\"><i class=\"fa fa-link\"></i> <span>Another Link</span></a></li>\n" +
    //     "        <li class=\"treeview\">\n" +
    //     "          <a href=\"#\"><i class=\"fa fa-link\"></i> <span>Multilevel</span>\n" +
    //     "            <span class=\"pull-right-container\">\n" +
    //     "                <i class=\"fa fa-angle-left pull-right\"></i>\n" +
    //     "              </span>\n" +
    //     "          </a>\n" +
    //     "          <ul class=\"treeview-menu\">\n" +
    //     "            <li><a href=\"#\">Link in level 2</a></li>\n" +
    //     "            <li><a href=\"#\">Link in level 2</a></li>\n" +
    //     "          </ul>\n" +
    //     "        </li>")

    $("#menu_article").click(function () {
        $(".content").load("app/article/article_list.html");
    })
});