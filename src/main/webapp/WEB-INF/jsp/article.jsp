<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/include/header.jsp"%><!-- ==================== S header ==================== -->
<div id="a1portalSkin_headerAreaA" class="header"><!-- Start_Module_332522 --><a name="28129" id="28129"></a>
    <div class="module-default">
        <div class="module-inner">
            <div id="a1portalSkin_ctr332522332522_mainArea" class="module-content"><!-- Start_Module_332522 --><!-- S responsive-carousel -->
                <div class="responsive-carousel carousel clearfix">
                    <div id="responsive-332522">
                        <div class="carousel-item" style="">
                            <div class="carousel-img"><a href="javascript:;" target=""><img src="${ctxStatic}/skin/img/article_banner.jpg" alt="{$field.title}" /></a></div>
                        </div>
                    </div>
                    <div class="carousel-btn carousel-btn-fixed" id="carousel-page-332522"></div>
                    <script type="text/javascript">

                        $(window).load(function(){
                            $("#responsive-332522").carouFredSel({
                                responsive : true,
                                width       : '100%',
                                items  : { visible : 1 },
                                auto     : { pauseOnHover: true, timeoutDuration:5000 },
                                swipe     : { onTouch:true, onMouse:true },
                                pagination  : "#carousel-page-332522"
                                //prev   : { button:"#carousel-prev-332522"},
                                //next   : { button:"#carousel-next-332522"},
                                //scroll : { fx : "coverfade", duration : 1200, timeoutDuration : 1500 }
                            });

                            $("#responsive-332522 .carousel-item").show();

                            //选项卡兼容代码
                            $(".tabs-nav > li > a").click(function(){

                                var _tabIndex = $(this).parents(".tabs-nav").find("li").index($(this).parent());

                                if( $(this).parents(".tabs-default").find(".tab-box").eq(_tabIndex).find("#responsive-332522").length > 0 ){

                                    /* S 原插件代码*/
                                    $("#responsive-332522").carouFredSel({
                                        responsive : true,
                                        width       : '100%',
                                        items  : { visible : 1 },
                                        auto     : { pauseOnHover: true, timeoutDuration:5000 },
                                        swipe     : { onTouch:true, onMouse:true },
                                        pagination  : "#carousel-page-332522"
                                        //prev   : { button:"#carousel-prev-332522"},
                                        //next   : { button:"#carousel-next-332522"},
                                        //scroll : { fx : "coverfade", duration : 1200, timeoutDuration : 1500 }
                                    });

                                    $("#responsive-332522 .carousel-item").show();
                                    /* E 原插件代码*/
                                };
                            });


                        });
                    </script></div>
                <!-- E responsive-carousel --><!-- End_Module_332522 --></div>
        </div>
    </div>
</div>
<!-- ==================== E Header ==================== --><!-- ==================== S main ==================== -->
<section class="main">
    <div class="page-width clearfix"><!-- S content -->
        <section class="content float-right"><!-- S page-title -->
            <section class="page-title page-title-inner clearfix"><!-- S breadcrumbs -->
                <div class="breadcrumbs float-right" skinobjectzone="HtmlBreadCrumb_2918"><span>当前位置：</span>{eyou:position style="crumb" /}</div>
                <!-- E breadcrumbs --><!-- S page-name -->
                <div class="page-name float-left">
                    <h2>{$eyou.field.typename}</h2>
                </div>
                <!-- E page-name --></section>
            <!-- E page-title -->
            <div id="a1portalSkin_mainArea" class="content-wrapper"><!-- Start_Module_332521 --><a name="25974" id="25974"></a>
                <div class="module-default">
                    <div class="module-inner">
                        <div id="a1portalSkin_ctr332521332521_mainArea" class="module-content"><!-- Start_Module_332521 --><!-- S article-detail -->
                            <div class="article-detail">
                                <div class="article-title">
                                    <h1>${article.title}</h1>
                                </div>
                                <div class="entry-meta">
                                    <span><strong>所属分类：</strong><a href="{$eyou.field.typeurl}">{$eyou.field.typename}</a> </span>
                                    <span><strong>发布时间：</strong><strong><fmt:formatDate value="${article.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/></strong></span>
                                    <span><strong></strong></span>
                                </div>
                                <div class="article-content-wrapper">
                                    <div class="article-content">
                                        <div class="qhd-content">${article.content}</div>
                                    </div>

                                    <span>{eyou:prenext get='pre' empty='<a>上一篇：暂无</a>'} <a href="{$field.arcurl}" title="{$field.title}"> 上一篇：{$field.title} </a> {/eyou:prenext}</span>
                                    <span class="pre-right">{eyou:prenext get='next' empty='<a>下一篇：暂无</a>'} <a href="{$field.arcurl}" title="{$field.title}"> 下一篇：{$field.title} </a> {/eyou:prenext}</span>

                                    <div class="detail-bottom">
                                        <div class="float-right detail-bottom-button"><a href="{$eyou.field.typeurl}">查看更多</a></div>
                                        <div class="share-toolbar float-left clearfix"><!-- S 分享到 -->
                                            <div class="bdsharebuttonbox"><span style="float:left; height:16px; line-height:16px; margin:6px 0 6px 0;">分享到：</span><a title="分享到QQ空间" href="#" class="bds_qzone" data-cmd="qzone"></a><a title="分享到新浪微博" href="#" class="bds_tsina" data-cmd="tsina"></a><a title="分享到腾讯微博" href="#" class="bds_tqq" data-cmd="tqq"></a><a title="分享到人人网" href="#" class="bds_renren" data-cmd="renren"></a><a title="分享到微信" href="#" class="bds_weixin" data-cmd="weixin"></a><a href="#" class="bds_more" data-cmd="more"></a></div>
                                            <script>
                                                window._bd_share_config={"common":{"bdSnsKey":{},"bdText":"","bdMini":"2","bdMiniList":false,"bdPic":"","bdStyle":"0","bdSize":"16"},"share":{}};with(document)0[(getElementsByTagName('head')[0]||body).appendChild(createElement('script')).src='http://bdimg.share.baidu.com/static/api/js/share.js?v=89860593.js?cdnversion='+~(-new Date()/36e5)];
                                            </script><!-- E 分享到 --></div>
                                    </div>
                                </div>
                            </div>
                            <!-- article-detail --><!-- End_Module_332521 --></div>
                    </div>
                </div>
            </div>
        </section>
        <!-- S content --><!-- S sidebar -->
        <%@ include file="/WEB-INF/include/left.jsp"%>
        <!-- E sidebar --></div>
</section>

<!-- ==================== S bottom ==================== -->
<%@ include file="/WEB-INF/include/footer.jsp"%>
<!-- ==================== E bottom ==================== -->
