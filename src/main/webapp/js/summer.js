/**
 * Created by xin on 16-8-4.
 */

//双击按钮弹出框,尚未实现
// $(document).ready(function(){
//     $('buttons').dblclick(function(){
//         alert('you have double-click the '+$(this).text()+' button');
//     });
// });

//单击按钮弹出框
// $(document).ready(function(){
//     $('.buttons').bind('click',function(){
//         alert('you have clicked the '+$(this).text()+' button');
//         $('.buttons').unbind('click');//点击之后禁用
//     });
// });
//鼠标移动事件
$(document).ready(function(){
    $('.buttons').bind('mousedown',function(){
        alert('the mouse button is pressed over '+$(this).text() +' button');
    });
    $('.buttons').mouseup(function(){
        alert('The mouse button is released over '+$(this).text()+' button');
    });
    $('.buttons').mouseover(function(){
        alert('The mouse is over '+$(this).text()+' button');
    });
});
//检测左键和右键事件。问题：总是显示单击右键
$(document).ready(function(){
    $('.button1').mousedown(function(event){
        if(event.button==1){
            $('p').text('Left mouse button is pressed');
        }else{
            $('p').text('Right mouse button is pressed');
        }
    });
});
//动态地凸显文本
$(document).ready(function(){
    $('.button2').mouseover(function(){
        $('p').css({
            'background-color':'cyan',
            'font-weight':'bold',
            'color':'blue'
        });
    });
});
//随着鼠标移动使图像明亮或模糊
$(document).ready(function(){
    $('img').css('opacity',0.4);
    $('.button3').bind('mouseover',function(){
        $('img').css('opacity',1.0);
    });
    $('.button3').bind('mouseout',function(){
        $('img').css('opacity',0.4);
    });
    $('.button3').bind('mousedown',function(){
        $('img').css('width',function(){return $(this).width()+50;});
        $('img').css('height',function(){return $(this).height()+30;});

    });
});
//查明元素何时获得和失去焦点.问题：焦点出发同时进行
$(document).ready(function(){
    $('.name').focus(function(){
        // alert('The focus currently is on name filed');
    });
    $('.name').blur(function(){
        alert('The focus is lost from name field');
    });
});

//在按钮上应用悬停效果
$(document).ready(function(){
    $('.button').hover(
        function(){
            $(this).addClass('hover');
        },
        function(){
            $(this).removeClass('hover');
        }
    );
});
//为响应事件而添加和删除文件
$(document).ready(function () {
    $('.add').click(function(){
        $('#haha').prepend('<p>Styles make the formatting job much.</p>')
    });
    $('.remove').click(function(){
        $('p').remove();
    });
});
//Ajax交互数据
$(function(){
    $("#send").click(function(){
        $.get("http://localhost:63342/Summer/src/main/webapp/html/div.html?_ijt=g4slamgcdsb037ae994ctg7jkh",{
            username:$("#username").val(),
            content:$("#content").val()

        },function(data,textStatus){
            $("#resText").html(data);
            }
        )
    })
})