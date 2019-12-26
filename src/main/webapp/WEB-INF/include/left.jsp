<section class="sidebar float-left"><!-- S page-menu -->
    <section class="page-menu" skinobjectzone="menu_3101">
        <div class="page-menu-title">
            <h3>{$eyou.field.typeid|gettoptype=###,'typename'}</h3>
        </div>
        <div class="page-menu-content">
            <ul>
                {eyou:channel type='first' id='field' currentstyle='current'}
                <li class="{$field.currentstyle}"><a href="{$field.typeurl}">{$field.typename}</a><i></i></li>
                {/eyou:channel}
            </ul>
            <script type="text/javascript">
                $(document).ready(function(){
                    $('.page-menu-content ul').find('li:last').addClass('last');

                    $('.page-menu-content > ul > li > a').click(function(){
                        if( $(this).parent('li').find('ul') ){
                            $(this).parent('li').find('ul').slideDown('fast');
                            $(this).parent('li').siblings('li').find('ul').slideUp('fast');
                            $(this).parent('li').addClass('current').siblings('li').removeClass('current');
                        }
                    });

                });
            </script></div>
    </section>
    <!-- S page-menu -->
    <div class="clear"></div>
    <div id="a1portalSkin_sidebarAreaA" class="QHDEmptyArea sidebar-content"></div>
</section>