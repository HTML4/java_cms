
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/include/taglib.jsp"%>
<!DOCTYPE html>
<head id="Head">
    <script type="text/javascript">var allpane = 'topAreaA|topAreaB|headerAreaA|mainArea|footerAreaA|bottomAreaA|fixedBottomArea|fixed-left|fixed-right|popup-area';</script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta content="width=device-width, initial-scale=1.0, user-scalable=no" name="viewport">
    <title>{eyou:global name='web_title' /}</title>
    <meta name="description" content="{eyou:global name='web_description' /}" />
    <meta name="keywords" content="{eyou:global name='web_keywords' /}" />

    <link href="{eyou:global name='web_cmspath' /}/favicon.ico" rel="shortcut icon" type="image/x-icon" />
    <meta http-equiv="PAGE-ENTER" content="RevealTrans(Duration=0,Transition=1)" />
    <link rel="stylesheet" type="text/css" href="${ctxStatic}/skin/css/qhdcontent.css" />
    <link rel="stylesheet" type="text/css" href="${ctxStatic}/skin/css/content.css" />
    <link rel="stylesheet" type="text/css" href="${ctxStatic}/skin/css/menu.css" />
    <link rel="stylesheet" type="text/css" href="${ctxStatic}/skin/css/jquery.fancybox-1.3.4.css" />
    <link rel="stylesheet" type="text/css" href="${ctxStatic}/skin/css/pgwslideshow.css" />
    <link rel="stylesheet" type="text/css" href="${ctxStatic}/skin/css/animate.min.css" />
    <link rel="stylesheet" type="text/css" href="${ctxStatic}/skin/css/style.css" />
    <link rel="stylesheet" type="text/css" href="${ctxStatic}/skin/css/style-brown.css" />
    <!--[if lt IE 9]>
    <script src="${ctxStatic}/skin/js/html5.js"></script>
    <![endif]--><!--[if IE 6]>
    <script type="text/javascript" src="${ctxStatic}/skin/js/ie7.js"></script>
    <script type="text/javascript" src="${ctxStatic}/skin/js/dd_belatedpng.js"></script>
    <script type="text/javascript">
        DD_belatedPNG.fix('.top img, .footer img, .bottom img, .form-btn, .module-icon-default');
    </script>
    <![endif]-->

</head>
<!-- 外部样式 -->

<body class="font-zh-CN" style="background:url(${ctxStatic}/skin/img/bg-img-01.jpg) top center fixed;">
<form name="Form" method="post" action="/" id="Form" enctype="multipart/form-data" style="height:inherit">
<div>
    <input type="hidden" name="__VIEWSTATE_CACHEKEY" id="__VIEWSTATE_CACHEKEY" value="VS_2ngowvm1kn1qbi4tfxq24oms_/" />
</div>
<script src="${ctxStatic}/skin/js/a1portalcore.js" type="text/javascript"></script>
<script src="${ctxStatic}/skin/js/a1portal.js"></script>
<script src="${ctxStatic}/skin/js/jquery-1.7.2.min.js"></script>
<script src="${ctxStatic}/skin/js/superfish.js"></script>
<script src="${ctxStatic}/skin/js/supposition.js"></script>
<script src="${ctxStatic}/skin/js/jquery.caroufredsel.js"></script>
<script src="${ctxStatic}/skin/js/jquery.touchswipe.min.js"></script>
<script src="${ctxStatic}/skin/js/jquery.tools.min.js"></script>
<script src="${ctxStatic}/skin/js/jquery.fancybox-1.3.4.pack.js"></script>
<script src="${ctxStatic}/skin/js/pgwslideshow.min.js"></script>
<script src="${ctxStatic}/skin/js/jquery.fixed.js"></script>
<script src="${ctxStatic}/skin/js/cloud-zoom.1.0.2.min.js"></script>
<script src="${ctxStatic}/skin/js/device.min.js"></script>
<script src="${ctxStatic}/skin/js/html5media-1.2.js"></script>
<script src="${ctxStatic}/skin/js/animate.min.js"></script>
<script src="${ctxStatic}/skin/js/isotope.pkgd.min.js"></script>
<script src="${ctxStatic}/skin/js/custom.js"></script>
<div id="wrapper" class="home-page">

    <!-- ==================== S top ==================== -->

    <header class="top header-v2 desktops-section default-top"><!-- top-bar -->
        <div class="top-bar clearfix">
            <div class="page-width"><!-- S language --><!-- E language -->
                <div id="a1portalSkin_topAreaA" class="QHDEmptyArea top-widget float-right"></div>
                <div id="a1portalSkin_topAreaB" class="QHDEmptyArea top-widget float-left"></div>
            </div>
        </div>
        <!-- top-bar --><!-- S top-main -->
        <div class="top-main">
            <div class="page-width clearfix">
                <div class="logo" skinobjectzone="HtmlLogo_750"><a href="/"><img src="${ctxStatic}/skin/img/_logo.png" alt="普洱茶官网" /></a></div>
                <!-- end of logo -->
            </div>
        </div>
        <!-- E top-main -->
        <div class="clear"></div>
        <div class="nav-wrapper fixed-nav">
            <div class="page-width clearfix"><!-- S nav -->
                <nav class="nav">
                    <div class="main-nav menuOoverallWidth clearfix" skinobjectzone="menu_849">
                        <ul class="sf-menu">
                            <li class="current"><a class="first-level" href="" target=""><strong>首页</strong></a><i></i></li>
                            <c:forEach items="${categoryList}" var="category" >
                                <li class="">
                                    <a class="first-level" href="" target=""><strong>${category.name}</strong></a><i></i>
                                    <c:if test="${category.children !=  null}">
                                        <ul class="">
                                        <c:forEach items="${category.children}" var="children">
                                            <li class="">
                                                <a class="first-level" href="" target=""><strong>${children.name}</strong></a><i></i>
                                            </li>
                                        </c:forEach>
                                        </ul>
                                    </c:if>
                                </li>
                            </c:forEach>
<%--                            <li class=""><a class="first-level" href="" target=""><strong>名称1</strong></a><i></i>--%>
<%--                                <ul class="">--%>
<%--                                    <li class=""><a class="" href="" target=""><strong>名称2</strong></a></li>--%>
<%--                                </ul>--%>
<%--                            </li>--%>
                        </ul>
                    </div>
                </nav>
                <!-- E nav--><script type="text/javascript">
                    $(function(){
                        $('.header-v2').menuMore();
                    });
                </script></div>
        </div>
        <!-- 导航跟随 --><script src="${ctxStatic}/skin/js/stickup.min.js" type="text/javascript"></script><script type="text/javascript">
            //initializing jQuery
            jQuery(function($) {
                $(document).ready( function() {
                    $('.fixed-nav').stickUp({
                        marginTop: 'auto'
                    });
                });
            });

        </script>
        <!-- //导航跟随 -->
    </header>
    <!-- S touch-top-wrapper -->
    <div class="touch-top mobile-section clearfix">
        <div class="touch-top-wrapper clearfix">
            <div class="touch-logo" skinobjectzone="HtmlLogo_1778"><a class="" href="/"><img src="${ctxStatic}/skin/img/_logo.png" alt="普洱茶官网" /></a></div>
            <!-- S touch-navigation -->
            <div class="touch-navigation">
                <div class="touch-toggle">
                    <ul>
                        <li class="touch-toggle-item-last"><a href="javascript:;" class="drawer-menu" data-drawer="drawer-section-menu"><i class="touch-icon-menu font-icon icon-uniE604"></i><span>导航</span></a></li>
                    </ul>
                </div>
            </div>
            <!-- E touch-navigation --></div>
        <!-- S touch-top -->
        <div class="touch-toggle-content touch-top-home">

            <div class="drawer-section drawer-section-menu">
                <div class="touch-menu" skinobjectzone="menu_2257">
                    <ul>
                        <li><a href="/"><span>首页</span></a></li>
                        <li><a href="javascript:;" href=""><span>哈哈</span><i class="touch-arrow-down"></i>哈哈2</a>
                            <ul>
                                <li><a class="" href=""><span>嘿嘿</span></a></li>

                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
            <script type="text/javascript">
                $(document).ready(function(){

                    $(".touch-toggle a").click(function(event){
                        var className = $(this).attr("data-drawer");

                        if( $("."+className).css('display') == 'none' ){
                            $("."+className).slideDown().siblings(".drawer-section").slideUp();
                        }else{
                            $(".drawer-section").slideUp();
                        }
                        event.stopPropagation();
                    });

                    /*$(document).click(function(){
                     $(".drawer-section").slideUp();
                    })*/

                    $('.touch-menu a').click(function(){
                        if( $(this).next().is('ul') ){
                            if( $(this).next('ul').css('display') == 'none' ){
                                $(this).next('ul').slideDown();
                                $(this).find('i').attr("class","touch-arrow-up");
                            }else{
                                $(this).next('ul').slideUp();
                                $(this).next('ul').find('ul').slideUp();
                                $(this).find('i').attr("class","touch-arrow-down");
                            }
                        }
                    });
                });
            </script></div>
        <!-- E touch-top --></div>
    <!-- E touch-top-wrapper --><!-- ==================== E top ==================== -->
