/*! 2016 Baidu Inc. All Rights Reserved */
define("common/js/loading",["require"],function(require){function e(e){this.content=e.content}return e.prototype={init:function(){this.resize(this.render())},view:function(){var e="";e+='<div class="zooming normal-pop">',e+='<div class="zooming-con">',e+='<div class="zooming-content">',e+=""+this.content,e+="</div>",e+="</div>",e+="</div>",e+='<div class="marsk normal-pop" ></div>';var t=$(e);return t},resize:function(e){var t=$(window).width(),n=$(window).height(),i=e.filter(".zooming").width(),r=e.filter(".zooming").height(),o=(n-r)/2,a=(t-i)/2;e.filter(".zooming").css({top:o,left:a})},remove:function(){$(".normal-pop").remove()},render:function(){return this.view().appendTo($("body"))}},e});