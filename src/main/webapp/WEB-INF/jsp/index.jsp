<%@ page contentType="text/html;charset=UTF-8" %>
        <%@ include file="/WEB-INF/include/header.jsp"%><!-- ==================== S header ==================== -->
        <div id="a1portalSkin_headerAreaA" class="header"><!-- Start_Module_332510 --><a name="28133" id="28133"></a>
            <div class="module-default">
                <div class="module-inner">
                    <div id="a1portalSkin_ctr332510332510_mainArea" class="module-content"><!-- Start_Module_332510 --><!-- S slideshow -->
                        <div class="slideshow carousel clearfix" style="height:500px; overflow:hidden;">
                            <div id="carousel-332510">
                                <div class="carousel-item">
                                    <div class="carousel-img"><a href="" ><img src="${ctxStatic}/skin/img/_banner.jpg" height="500" alt="{$field.title}" /></a></div>
                                </div>
                                <div class="carousel-item">
                                    <div class="carousel-img"><a href="" ><img src="${ctxStatic}/skin/img/_banner.jpg" height="500" alt="{$field.title}" /></a></div>
                                </div>
                            </div>
                            <div class="carousel-btn carousel-btn-fixed" id="carousel-page-332510"></div>
                        </div>
                        <script type="text/javascript">

                            $(window).bind("load resize",function(){
                                $("#carousel-332510").carouFredSel({
                                    width       : '100%',
                                    items  : { visible : 1 },
                                    auto     : { pauseOnHover: true, timeoutDuration:5000 },
                                    swipe     : { onTouch:true, onMouse:true },
                                    pagination  : "#carousel-page-332510"
                                    //prev   : { button:"#carousel-prev-332510"},
                                    //next   : { button:"#carousel-next-332510"},
                                    //scroll   : { fx : "crossfade" }
                                });

                                //选项卡兼容代码
                                $(".tabs-nav > li > a").click(function(){

                                    var _tabIndex = $(this).parents(".tabs-nav").find("li").index($(this).parent());

                                    if( $(this).parents(".tabs-default").find(".tab-box").eq(_tabIndex).find("#carousel-332510").length > 0 ){

                                        /* S 原插件代码*/
                                        $("#carousel-332510").carouFredSel({
                                            width       : '100%',
                                            items  : { visible : 1 },
                                            auto     : { pauseOnHover: true, timeoutDuration:5000 },
                                            swipe     : { onTouch:true, onMouse:true },
                                            pagination  : "#carousel-page-332510"
                                            //prev   : { button:"#carousel-prev-332510"},
                                            //next   : { button:"#carousel-next-332510"},
                                            //scroll   : { fx : "crossfade" }
                                        });
                                        /* E 原插件代码*/
                                    };
                                });
                            });
                        </script><!-- E slideshow --><!-- End_Module_332510 --></div>
                </div>
            </div>
        </div>
        <!-- ==================== E Header ==================== --><!-- ==================== S main ==================== -->
        <section class="main">
            <div id="a1portalSkin_mainArea" class="full-screen clearfix"><!-- Start_Module_332505 --><a name="28030" id="28030"></a><!-- S module-full-screen -->
                <div class="module-full-screen" style="">
                    <div class="module-inner not-animated" data-animate="fadeInUp" data-delay="200">
                        <div class="page-width">
                            <div class="module-full-screen-title">
                                <h2>产品展示</h2>
                                <div class="module-title-content" ><i class="mark-left"></i>
                                    <h3>PRODUCT</h3>
                                    <i class="mark-right"></i></div>
                            </div>
                            <div id="a1portalSkin_ctr332505332505_mainArea" class="module-full-screen-content"><!-- Start_Module_332505 --><!-- S portfolio-list -->
                                <div class="portfolio-list product-list ieCode-del">
                                    <ul class="row2-svar clearfix">
                                        <c:forEach items="${productList}" var="product">
                                            <li class="col-4-1 {eyou:eq name='$mod' value='0'}last{/eyou:eq} not-animated" data-animate="fadeInUp">
                                                <div class="product-item">
                                                    <div class="portfolio-img"><a href="{$field.arcurl}"><img src="${ctxImg}${product.thumbnail}" alt="{$field.title}" /></a></div>
                                                    <div class="portfolio-title">
                                                        <h2><a href="{$field.arcurl}">${product.title}</a></h2>
                                                    </div>
                                                </div>
                                            </li>
                                        </c:forEach>
                                    </ul>
                                </div>
                                <!-- E portfolio-list --><!-- S portfolio-list -->
                                <div class="portfolio-list product-list ieCode">
                                    <ul class="column clearfix">
                                        <li class="col-4-1 {eyou:eq name='$mod' value='0'}last{/eyou:eq} not-animated" data-animate="fadeInUp">
                                            <div class="product-item">
                                                <div class="portfolio-img"><a href="{$field.arcurl}"><img src="{$field.litpic}" alt="{$field.title}" /></a></div>
                                                <div class="portfolio-title">
                                                    <h2><a href="{$field.arcurl}">有事标题</a></h2>
                                                </div>
                                            </div>
                                        </li>
                                    </ul>
                                </div>
                                <!-- E portfolio-list --><!-- End_Module_332505 --></div>
                            <div class="module-full-screen-more"><a href="{eyou:field name='typeurl' /}">更多产品</a></div>
                        </div>
                    </div>
                </div>
                <!-- E module-full-screen --><!-- Start_Module_332506 --><a name="28028" id="28028"></a><!-- S module-full-screen -->
                <div class="module-full-screen module-full-screen-bg-img" style="background-image:url(${ctxStatic}/skin/img/_title-bg.jpg);">
                    <div class="module-inner not-animated" data-animate="fadeInUp" data-delay="200">
                        <div class="page-width">
                            <div id="a1portalSkin_ctr332506332506_mainArea" class="module-full-screen-content"><!-- Start_Module_332506 -->
                                <div class="qhd-content">
                                    <p style="text-align: center;"> <span style="color: rgb(76, 76, 76); font-family: 微软雅黑; font-size: 28px; line-height: normal; text-align: center;">啦啦啦</span></p>
                                    <p style="text-align: center;"> <span style="color: rgb(76, 76, 76); font-family: 微软雅黑; font-size: 28px; line-height: normal; text-align: center;">热线电话：86-13333333</span></p>
                                </div>
                                <!-- End_Module_332506 --></div>
                        </div>
                    </div>
                </div>
                <!-- E module-full-screen --><!-- Start_Module_332507 --><a name="28027" id="28027"></a><!-- S module-full-screen -->
                <div class="module-full-screen module-full-screen-gray-expand module-full-screen-gray" style="">
                    <div class="module-inner not-animated" data-animate="fadeInDown" data-delay="200">
                        <div class="page-width">
                            <div class="module-full-screen-title">
                                <h2>公司简介</h2>
                                <div class="module-title-content"><i class="mark-left"></i>
                                    <h3>ABOUT US</h3>
                                    <i class="mark-right"></i></div>
                            </div>
                            <div id="a1portalSkin_ctr332507332507_mainArea" class="module-full-screen-content"><!-- Start_Module_332507 -->
                                <div class="qhd-content">
                                    <p style="text-align: center;"> <span style="font-size:16px;">啥啥啥...${about.createTime}</span></p>
                                    <p style="text-align: center;">&nbsp; </p>
                                    <p style="text-align: center;"> <span style="font-size:16px;"><img alt="" src="{eyou:field name='litpic' /}" style="width: 1027px; height: 173px;" /></span></p>
                                </div>
                                <!-- End_Module_332507 --></div>
                            <div class="module-full-screen-more"><a href="{eyou:field name='typeurl' /}">了解更多</a></div>
                        </div>
                    </div>
                </div>
                <!-- E module-full-screen --><!-- Start_Module_332508 --><a name="28031" id="28031"></a><!-- S module-full-screen -->
                <div class="module-full-screen" style="">
                    <div class="module-inner not-animated" data-animate="fadeInUp" data-delay="200">
                        <div class="page-width">
                            <div class="module-full-screen-title">
                                <h2>新闻资讯</h2>
                                <div class="module-title-content" ><i class="mark-left"></i>
                                    <h3>NEWS</h3>
                                    <i class="mark-right"></i></div>
                            </div>
                            <div id="a1portalSkin_ctr332508332508_mainArea" class="module-full-screen-content"><!-- Start_Module_332508 --><!-- S headlines-list-2col -->
                                <div class="headlines-list-2col clearfix">
                                    <div class="headlines-content not-animated" data-animate="fadeInUp" data-delay="200">
                                        <p><a href="{$field.arcurl}"><img src="{$field.litpic}" height="217" alt="{$field.title}" /></a></p>
                                        <h2><a href="{$field.arcurl}"> </a></h2>
                                        <div class="headlines-content-summary">
                                            <div class="qhd-content">
                                                <p>描述...</p>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="headlines-others not-animated" data-animate="fadeInUp" data-delay="400"><!-- S entry-list -->
                                        <div class="entry-list entry-list-time-hl entry-set-time-hl"><!-- S entry-item --><!-- E entry-item -->
                                            <!-- S entry-item -->
                                            <div class="entry-item">
                                                <div class="time">
                                                    <p class="time-day">10</p>
                                                    <p class="time-date">2019-10</p>
                                                </div>
                                                <div class="entry-title">
                                                    <h2><a href="{$field.arcurl}">标题</a></h2>
                                                </div>
                                                <div class="entry-summary">
                                                    <div class="qhd-content">
                                                        <p>描述...</p>
                                                    </div>
                                                </div>
                                            </div>
                                            <!-- E entry-item -->
                                        </div>
                                        <!-- E entry-list --></div>
                                </div>
                                <!-- E headlines-list-2col --><!-- End_Module_332508 --></div>
                        </div>
                    </div>
                </div>
                <!-- E module-full-screen --></div>
            <!-- end of page-width --></section>
        <!-- ==================== E main ==================== -->


    <!-- ==================== S bottom ==================== -->
    <%@ include file="/WEB-INF/include/footer.jsp"%>
    <!-- ==================== E bottom ==================== -->


