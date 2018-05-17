<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>商品详情</title>
<link type="text/css" href="css/css.css" rel="stylesheet" />
<script type="text/javascript" src="js/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="js/js.js"></script>
<script type="text/javascript" src="js/payfor.js"></script>
</head>

<body>

	<div>${goods.id}/${user.id}</div>

 <div class="hrader" id="header">
  <%@ include file="header.jspf" %>
 </div><!--hrader/-->
 <div class="mid">
  <h1 class="logo" style="text-align:left;">
  <a href="index.html"><img src="images/logo.png" width="304" height="74" /></a>
  </h1>
  <form action="#" method="get" class="subBox">
   <div class="subBox2">
    <input type="text" class="subText" />
    <input type="image" src="images/sub.jpg" width="95" height="32" class="subImg" />
    <div class="hotci">
    <a href="#">酷派大神</a>
    <a href="#">三星s5</a>
    <a href="#">诺基亚1020</a>
    <a href="#">Iphone 6</a>
    <a href="#">htc one</a>
   </div><!--hotci/-->
   </div><!--subBox2/-->
  </form><!--subBox/-->
  <div class="ding-gou">
   <div class="ding">
    <a href="order.html"><img src="images/dingdan.jpg" width="106" height="32" /></a>
   </div><!--ding/-->
   <div class="gou">
    <a href="car.html"><img src="images/gouwuche.jpg" width="126" height="32" /></a>
   </div><!--gou/-->
   <div class="clears"></div>
  </div><!--ding-gou/-->
 </div><!--mid-->
 <div class="navBox navBg1">
  <ul class="nav">
   <li><a href="index.html">首页</a></li>
   <li><a href="buy.html">买家</a></li>
   <li><a href="sell.html">卖家</a></li>
   <li><a href="vip.html">会员中心</a></li>
   <li><a href="xuanshang.html">悬赏榜</a></li>
   <li><a href="luntan.html" class="luntan">论坛</a></li>
   <li><a href="help.html">帮助</a></li>
   <div class="clears"></div>
  </ul><!--nav/-->
 </div><!--navBox/-->
 <div class="bn"><img src="images/dingzhi.jpg" width="972" height="167" /></div>
 <div class="buyinfo">
  <div class="buyDtl">
   <div class="buyDtlLeft">
    <div class="buyimgBig">
     <img src="images/buyinfo1.jpg" width="360" height="360" />
     <img src="images/buyinfo1.jpg" width="360" height="360" />
     <img src="images/buyinfo1.jpg" width="360" height="360" />
     <img src="images/buyinfo1.jpg" width="360" height="360" />
     <img src="images/buyinfo1.jpg" width="360" height="360" />
    </div><!--buyimgBig/-->
    <ul class="buyimgsmall">
     <li><img src="images/buyinfo-s1.jpg" width="50" height="50" /></li>
     <li><img src="images/buyinfo-s2.jpg" width="50" height="50" /></li>
     <li><img src="images/buyinfo-s3.jpg" width="50" height="50" /></li>
     <li><img src="images/buyinfo-s4.jpg" width="50" height="50" /></li>
     <li><img src="images/buyinfo-s5.jpg" width="50" height="50" /></li>
    </ul><!--buyimgsmall/-->
   </div><!--buyDtlLeft/-->
   <div class="buyDtlRight">
    <h3>联想 A808T 黄金斗士</h3>
    <h4>【赠送精品蓝牙耳机+超大容量移动电源】5.0英寸高清大屏 真八核1.7GHz 1300万像素主摄像头</h4>
    <h5>价格：<span>￥</span><strong id="price_item_1">1999.00</strong></h5>
    <table class="buyTable">
     <tr>
      <th width="70">商品编号</th>
      <td>201410221013</td>
     </tr>
     <tr>
      <th width="70">运费</th>
      <td>包邮</td>
     </tr>
     <tr>
      <th width="70">机身颜色</th>
      <td>
       <ul class="buyji">
        <li>黑色</li>
        <li>灰色</li>
        <li>银色</li>
        <div class="clears"></div>
       </ul><!--buyji/-->
      </td>
     </tr>
     <tr>
      <th width="70">机身内存</th>
      <td>
       <ul class="buyji">
        <li>8GB</li>
        <li>16GB</li>
        <li>32GB</li>
        <li>64GB</li>
        <div class="clears"></div>
       </ul><!--buyji/-->
      </td>
     </tr>
     <tr>
      <th width="70">手机库存</th>
      <td>有货</td>
     </tr>
     <tr>
      <th width="70">购买数量</th>
      <td>
       <div class="p_number">
		<div class="f_l add_chose">
			<a class="reduce" onClick="setAmount.reduce('#qty_item_1')" href="javascript:void(0)">-</a>
			<input type="text" name="qty_item_1" value="1" id="qty_item_1" onKeyUp="setAmount.modify('#qty_item_1')" class="text" />
			<a class="add" onClick="setAmount.add('#qty_item_1')" href="javascript:void(0)">+</a>
		</div>
		
		<div class="f_l buy">
			总价：<span class="total-font" id="total_item_1">￥89.00</span>
			<input type="hidden" name="total_price" id="total_price" value="" />
		</div>
	
	</div>
      </td>
     </tr>
    </table><!--buyTable/-->
    <div class="goumai">
     <a href="car.html" class="buy-gou">立即购买</a>
     <a href="#" class="buy-mai">加入购物车</a>
    </div><!--goumai/-->
   </div><!--buyDtlRight/-->
   <div class="clears"></div>
  </div><!--buyDtl/-->
  <div class="buyDtl2">
   <ul class="buydel2Eq">
    <li>商品描述</li>
    <li>规格参数</li>
    <li>包装信息</li>
    <li>售后服务</li>
    <div class="clears"></div>	
   </ul><!--buydel2Eq/-->
   <div class="buydlList">
    <table cellpadding="0" cellspacing="1" width="100%" border="0" class="Ptable"><tr><th class="tdTitle" colspan="2">主体</th><tr><tr><td class="tdTitle">品牌</td><td>三星（SAMSUNG）</td></tr><tr><td class="tdTitle">型号</td><td>Galaxy S5 G9008</td></tr><tr><td class="tdTitle">颜色</td><td>闪耀白</td></tr><tr><td class="tdTitle">上市年份</td><td>2014年</td></tr><tr><td class="tdTitle">输入方式</td><td>触控</td></tr><tr><td class="tdTitle">智能机</td><td>是</td></tr><tr><td class="tdTitle">3G视频通话</td><td>不支持</td></tr><tr><td class="tdTitle">操作系统版本</td><td>Android 4.4</td></tr><tr><td class="tdTitle">CPU品牌</td><td>骁龙</td></tr><tr><td class="tdTitle">CPU频率</td><td>2.5GHz</td></tr><tr><td class="tdTitle">CPU核数</td><td>四核</td></tr><tr><td class="tdTitle">运营商标志或内容</td><td>在外包装、在机身、在开机画面、在内置应用</td></tr><tr><th class="tdTitle" colspan="2">网络</th><tr><tr><td class="tdTitle">4G网络制式</td><td>移动4G(TD-LTE)</td></tr><tr><td class="tdTitle">3G网络制式</td><td>移动3G(TD-SCDMA)</td></tr><tr><td class="tdTitle">2G网络制式</td><td>移动2G/联通2G(GSM)</td></tr><tr><td class="tdTitle">网络制式</td><td>移动4G(TD-LTE)-移动3G(TD-SCDMA)-移动2G/联通2G(GSM)</td></tr><tr><td class="tdTitle">网络频率</td><td>TD-LTE(1900/2300/2600) TD-SCDMA(1880/2010) GSM/EDGE/GPRS (850/900/1800/1900 MHZ)</td></tr><tr><td class="tdTitle">数据业务</td><td>HSPA + ： 42 / 5.76 Mbps；TD-LTE</td></tr><tr><th class="tdTitle" colspan="2">存储</th><tr><tr><td class="tdTitle">机身内存</td><td>16GB ROM</td></tr><tr><td class="tdTitle">运行内存</td><td>2GB RAM</td></tr><tr><td class="tdTitle">储存卡类型</td><td>MicroSD(TF)</td></tr><tr><td class="tdTitle">最大存储扩展</td><td>128GB</td></tr><tr><td class="tdTitle">可用空间</td><td>操作系统和预置应用程序占用部分存储空间, 因此实际用户可用空间少于存储器标称容量。操作系统或软件版本的更新可能会导致用户可用空间发生变化。</td></tr><tr><th class="tdTitle" colspan="2">显示</th><tr><tr><td class="tdTitle">屏幕尺寸</td><td>5.1英寸</td></tr><tr><td class="tdTitle">触摸屏</td><td>电容屏，多点触控</td></tr><tr><td class="tdTitle">分辨率</td><td>1920×1080(FHD,1080P)</td></tr><tr><td class="tdTitle">屏幕材质</td><td>Super AMOLED</td></tr><tr><td class="tdTitle">屏幕色彩</td><td>1600万色 </td></tr><tr><th class="tdTitle" colspan="2">感应器</th><tr><tr><td class="tdTitle">GPS模块</td><td>支持</td></tr><tr><td class="tdTitle">重力感应</td><td>支持</td></tr><tr><td class="tdTitle">光线感应</td><td>支持</td></tr><tr><td class="tdTitle">距离感应</td><td>支持</td></tr><tr><th class="tdTitle" colspan="2">摄像功能</th><tr><tr><td class="tdTitle">摄像头</td><td>1600万像素</td></tr><tr><td class="tdTitle">副摄像头</td><td>200万像素</td></tr><tr><td class="tdTitle">传感器类型</td><td>CMOS</td></tr><tr><td class="tdTitle">闪光灯</td><td>LED补光灯</td></tr><tr><td class="tdTitle">变焦模式</td><td>数码变焦</td></tr><tr><td class="tdTitle">自动对焦</td><td>支持</td></tr><tr><th class="tdTitle" colspan="2">娱乐功能</th><tr><tr><td class="tdTitle">音乐播放</td><td>支持</td></tr><tr><td class="tdTitle">视频播放</td><td>支持</td></tr><tr><td class="tdTitle">电视播放</td><td>不支持</td></tr><tr><th class="tdTitle" colspan="2">传输功能</th><tr><tr><td class="tdTitle">Wi-Fi</td><td>支持</td></tr><tr><td class="tdTitle">蓝牙</td><td>支持</td></tr><tr><td class="tdTitle">WIFI热点</td><td>支持</td></tr><tr><th class="tdTitle" colspan="2">其他</th><tr><tr><td class="tdTitle">SIM卡尺寸</td><td>小卡</td></tr><tr><td class="tdTitle">电池类型</td><td>锂电池</td></tr><tr><td class="tdTitle">电池容量（mAh）</td><td>2800mA/h</td></tr><tr><td class="tdTitle">电池更换</td><td>支持</td></tr><tr><td class="tdTitle">数据线</td><td>Micro USB </td></tr><tr><td class="tdTitle">机身尺寸（mm）</td><td>142 x 72.5 x 8.1mm</td></tr><tr><td class="tdTitle">机身重量（g）</td><td>146.5g</td></tr></table>
   </div><!--buydlList/-->
   <div class="buydlList">
    2
   </div><!--buydlList/-->
   <div class="buydlList">
    3
   </div><!--buydlList/-->
   <div class="buydlList">
    4
   </div><!--buydlList/-->
  </div><!--buyDtl2/-->
 </div><!--buyinfo/-->
 <div class="footBox">
  <div class="footers">
   <div class="footersLeft">
    <a href="index.html"><img src="images/ftlogo.jpg" width="240" height="64" /></a>
    <h3 class="ftphone">400 000 0000 </h3>
    <div class="ftKe">
     客服 7x24小时(全年无休)<br />
     <span>客服邮箱：kefu@webqin.net </span>
    </div><!--ftKe/-->
   </div><!--footersLeft/-->
   <div class="footersRight">
    <ul>
     <li class="ftTitle">新手指南</li>
     <li><a href="#">购物流程</a></li>
     <li><a href="#">会员计划及划分</a></li>
     <li><a href="#">优惠券规则</a></li>
     <li><a href="#">联系客服</a></li>
     <li><a href="#">常见问题</a></li>
    </ul>
    <ul>
     <li class="ftTitle">付款方式</li>
     <li><a href="#">在线支付</a></li>
     <li><a href="#">礼品卡支付</a></li>
     <li><a href="#">货到付款</a></li>
     <li><a href="#">银行付款</a></li>
    </ul>
    <ul>
     <li class="ftTitle">配送服务</li>
     <li><a href="#">配送时效及运费</a></li>
     <li><a href="#">超时赔付</a></li>
     <li><a href="#">验货与签收</a></li>
     <li><a href="#">配货信息跟踪</a></li>
    </ul>
    <ul>
     <li class="ftTitle">售后服务</li>
     <li><a href="#">退换货政策</a></li>
     <li><a href="#">退换货区域</a></li>
     <li><a href="#">退款时限</a></li>
     <li><a href="#">先行赔付</a></li>
     <li><a href="#">发票说明</a></li>
    </ul>
    <ul>
     <li class="ftTitle">特色服务</li>
     <li><a href="#">礼品卡</a></li>
     <li><a href="#">产品试用</a></li>
     <li><a href="#">花粉中心</a></li>
     <li><a href="#">快速购物</a></li>
     <li><a href="#">推荐好友</a></li>
    </ul>
    
    <div class="clears"></div>
   </div><!--footersRight/-->
   <div class="clears"></div>
  </div><!--footers/-->
 </div><!--footBox/-->
 <div class="footer" style="text-align:left;">
  <a href="#">关于我们</a>
  <a href="#">友情链接</a>
  <a href="#">版权声明</a>
  <a href="#">网站地图</a>
  <br />
  <span>&copy; 2014 Unqezi 使用前必读 沪ICP备 12007626号-1</span>
 </div><!--footer/-->
</body>
</html>
