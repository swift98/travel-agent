(this.webpackJsonptravel=this.webpackJsonptravel||[]).push([[4],{105:function(e,n,t){e.exports=t.p+"static/media/whut.192023e0.jpg"},138:function(e,n,t){e.exports=t(214)},20:function(e,n,t){"use strict";t.d(n,"d",(function(){return o})),t.d(n,"e",(function(){return c})),t.d(n,"c",(function(){return l})),t.d(n,"a",(function(){return i})),t.d(n,"b",(function(){return u})),t.d(n,"f",(function(){return s})),t.d(n,"k",(function(){return d})),t.d(n,"l",(function(){return f})),t.d(n,"i",(function(){return h})),t.d(n,"g",(function(){return p})),t.d(n,"h",(function(){return g})),t.d(n,"j",(function(){return v}));var a=t(40),r=t.n(a),o="login",c="logout",l="init_route",i="init_bill",u="init_my_route",s="search_route",d=function(e){return{type:o,data:{login:!0,user:e}}},f=function(){return{type:c,data:{login:!1,user:null}}},h=function(){return function(e){r.a.get("/route/allRoutes").then((function(n){e(m(n.data))})).catch((function(e){console.log(e)}))}},m=function(e){return{type:l,data:{routes:e}}},p=function(e){return function(n){r.a.get("/route/myBill?userId=".concat(e)).then((function(e){e.data.success&&n(b(e.data.bills))})).catch((function(e){console.log(e)}))}},b=function(e){return{type:i,data:{bills:e}}},g=function(e){return function(n){r.a.get("/route/myRoute?agentId=".concat(e)).then((function(e){e.data.success&&n(E(e.data.routes))})).catch((function(e){console.log(e)}))}},E=function(e){return e.forEach((function(e){return e.key=e.id})),{type:u,data:{myRoute:e}}},v=function(e){return function(n){r.a.get("/route/searchRoute?keyWord=".concat(e)).then((function(e){e.data.success&&n(y(e.data.routes))})).catch((function(e){console.log(e)}))}},y=function(e){return{type:s,data:{search:e}}}},214:function(e,n,t){"use strict";t.r(n);var a=t(0),r=t.n(a),o=t(6),c=t.n(o),l=t(46),i=t(21),u=t(27),s=t(39),d=t(122),f=t(20),h={login:!1,user:null,routes:[],bills:[],myRoute:[],search:[]},m=(window.__REDUX_DEVTOOLS_EXTENSION_COMPOSE__?window.__REDUX_DEVTOOLS_EXTENSION_COMPOSE__({}):s.c)(Object(s.a)(d.a)),p=Object(s.d)((function(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:h,n=arguments.length>1?arguments[1]:void 0;switch(n.type){case f.d:case f.e:case f.c:case f.a:case f.b:case f.f:return Object.assign({},e,n.data);default:return e}}),m),b=t(47),g=t(48),E=t(52),v=t(49),y=t(51),x=function(e){return function(n){function t(e){var n;return Object(b.a)(this,t),(n=Object(E.a)(this,Object(v.a)(t).call(this,e))).state={component:null},n}return Object(y.a)(t,n),Object(g.a)(t,[{key:"componentDidMount",value:function(){var n=this;e().then((function(e){n.setState({component:e.default})}))}},{key:"render",value:function(){var e=this.state.component;return e?r.a.createElement(e,this.props):null}}]),t}(r.a.Component)},O=(t(133),t(3)),k=(t(129),t(65)),w=t(64),j=(t(130),t(91)),_=t(29),S=t(30);function N(){var e=Object(_.a)(["\n  float: left;\n  margin-left: 100px;\n  margin-right: 100px;\n  height: 56px;\n  a {\n    color: #333;\n    padding: 0 15px;\n    display: inline-block;\n    :hover {\n      color: #333;\n      background-color: #f5f5f5;\n    }\n  }\n"]);return N=function(){return e},e}function P(){var e=Object(_.a)(["\n  float: left;\n  cursor: pointer;\n  height: 56px;\n  font-weight: bold;\n  a {\n    color: #333;\n    :hover {\n      color: #444;\n    }\n  }\n  .logo {\n    width: 54px;\n    margin-right: 15px;\n  }\n"]);return P=function(){return e},e}function q(){var e=Object(_.a)(["\n  z-index: 1000;\n  position: absolute;\n  top: 56px;\n  left: 0;\n  background-color: #fff;\n  .item {\n    padding: 5px 15px;\n    width: 150px;\n    text-align: center;\n    :hover {\n      background-color: #f5f5f5;\n    }\n  }\n"]);return q=function(){return e},e}function R(){var e=Object(_.a)(["\n  width: 100%;\n  height: 56px;\n  line-height: 56px;\n  font-size: 17px;\n  border-bottom: 1px solid #f0f0f0;\n  background-color: #fff;\n  .limit {\n    min-width:1000px;\n    max-width:1250px;\n    margin:0 auto;\n    .btn {\n      margin: 0 10px;\n      diaplay: block;\n      height: 38px;\n      width: 78px;\n      line-height: 38px;\n      border-radius: 8px;\n      float: right;\n      margin-top: 9px;\n      color: #ec7259;\n      border: 1px solid #ec7259;\n      text-align: center;\n    }\n    .btn:hover {\n      background-color: #fef8f7;\n    }\n    .icon {\n      height: 56px;\n      float: right;\n      cursor: default;\n      padding: 0 5px;\n      position: relative;\n      :hover {\n        background-color: #f5f5f5;\n      }\n    }\n  }\n"]);return R=function(){return e},e}var C=S.b.div(R()),D=S.b.div(q()),M=S.b.div(P()),T=S.b.div(N()),B=t(105),I=t.n(B),L=j.a.Search,X=function(e){function n(e){var t;return Object(b.a)(this,n),(t=Object(E.a)(this,Object(v.a)(n).call(this,e))).state={show:!1},t.handleSearch=t.handleSearch.bind(Object(w.a)(t)),t}return Object(y.a)(n,e),Object(g.a)(n,[{key:"handleSearch",value:function(e,n){n.preventDefault(),e?this.props.history.push("/search/".concat(e)):k.a.warn("\u8bf7\u8f93\u5165\u5173\u952e\u5b57\u8fdb\u884c\u641c\u7d22")}},{key:"render",value:function(){var e=this,n=this.props,t=n.loading,o=n.user,c=n.logout,l=this.state.show,u=r.a.createElement(a.Fragment,null,r.a.createElement(i.b,{to:"/login",className:"login btn"},"\u767b\u5f55"),r.a.createElement(i.b,{to:"/register",className:"register btn"},"\u6ce8\u518c")),s=null!==o?r.a.createElement("div",{className:"icon",onMouseEnter:function(){e.setState({show:!0})},onMouseLeave:function(){e.setState({show:!1})}},"agent"===o.role?r.a.createElement(O.a,{type:"bank"}):r.a.createElement(O.a,{type:"\u7537"===o.sex?"man":"woman"}),"\xa0\xa0",o.name,"\xa0\xa0",r.a.createElement(O.a,{type:"caret-down"}),l?r.a.createElement(D,null,r.a.createElement(i.b,{to:"agent"===o.role?"/myRoute":"/myBill"},r.a.createElement("div",{className:"item"},r.a.createElement(O.a,{type:"agent"===o.role?"rise":"dollar"}),"\xa0\xa0","agent"===o.role?"\u6211\u7684\u8def\u7ebf":"\u6211\u7684\u8d26\u5355")),"agent"===o.role?r.a.createElement(i.b,{to:"/new_route"},r.a.createElement("div",{className:"item"},r.a.createElement(O.a,{type:"plus"}),"\xa0\xa0\u6dfb\u52a0\u8def\u7ebf")):null,r.a.createElement("div",{className:"item",onClick:c},r.a.createElement(O.a,{type:"logout"}),"\xa0\xa0\u9000\u51fa")):null):null;return r.a.createElement(C,null,r.a.createElement("div",{className:"limit"},r.a.createElement(M,null,r.a.createElement("a",{href:"http://www.whut.edu.cn",target:"_blank",rel:"noopener noreferrer"},r.a.createElement("img",{className:"logo",src:I.a,alt:"Logo"}),"\u65c5\u884c\u4ee3\u7406")),r.a.createElement(T,null,r.a.createElement(i.b,{to:"/"},"\u9996\u9875"),r.a.createElement(i.b,{to:"/"},"\u4e0b\u8f7dAPP")),r.a.createElement(L,{className:"search",placeholder:"\u641c\u7d22\u7ebf\u8def",onSearch:this.handleSearch,enterButton:!0,style:{float:"left",width:"250px",marginTop:"11px"}}),t?s:u))}}]),n}(r.a.Component),z=Object(l.b)((function(e){return{loading:e.login,user:e.user}}),(function(e){return{logout:function(){e(Object(f.l)()),k.a.info("\u9000\u51fa\u767b\u5f55")}}}))(Object(u.f)(X));function F(){var e=Object(_.a)(["\n    html, body, div, span, applet, object, iframe,\n    h1, h2, h3, h4, h5, h6, p, blockquote, pre,\n    a, abbr, acronym, address, big, cite, code,\n    del, dfn, em, img, ins, kbd, q, s, samp,\n    small, strike, strong, sub, sup, tt, var,\n    b, u, i, center,\n    dl, dt, dd, ol, ul, li,\n    fieldset, form, label, legend,\n    table, caption, tbody, tfoot, thead, tr, th, td,\n    article, aside, canvas, details, embed,\n    figure, figcaption, footer, header, hgroup,\n    menu, nav, output, ruby, section, summary,\n    time, mark, audio, video {\n        margin: 0;\n        padding: 0;\n        border: 0;\n        font-size: 100%;\n        font: inherit;\n    }\n/* HTML5 display-role reset for older browsers */\narticle, aside, details, figcaption, figure,\nfooter, header, hgroup, menu, nav, section {\n    display: block;\n}\nbody {\n    line-height: 1;\n}\nol, ul {\n    list-style: none;\n}\nblockquote, q {\n    quotes: none;\n}\nblockquote:before, blockquote:after,\nq:before, q:after {\n    content: '';\n    content: none;\n}\ntable {\n    border-collapse: collapse;\n    border-spacing: 0;\n}\n"]);return F=function(){return e},e}var H=Object(S.a)(F()),J=x((function(){return Promise.all([t.e(0),t.e(1),t.e(2),t.e(8)]).then(t.bind(null,455))})),U=x((function(){return Promise.all([t.e(0),t.e(1),t.e(2),t.e(10)]).then(t.bind(null,449))})),V=x((function(){return Promise.all([t.e(0),t.e(3),t.e(11)]).then(t.bind(null,450))})),W=x((function(){return Promise.all([t.e(0),t.e(3),t.e(9),t.e(15)]).then(t.bind(null,451))})),A=x((function(){return Promise.all([t.e(0),t.e(1),t.e(2),t.e(13)]).then(t.bind(null,452))})),G=x((function(){return Promise.all([t.e(0),t.e(1),t.e(2),t.e(14)]).then(t.bind(null,453))})),K=x((function(){return Promise.all([t.e(1),t.e(7),t.e(12)]).then(t.bind(null,454))})),Q={width:"1000px",margin:"10px auto",height:"100%",minHeight:"650px",backgroundColor:"#fff",padding:"15px"};var Y=function(){return r.a.createElement(l.a,{store:p},r.a.createElement("div",{style:{backgroundColor:"#f9f9f9"}},r.a.createElement(H,null),r.a.createElement(i.a,null,r.a.createElement(a.Fragment,null,r.a.createElement(z,null),r.a.createElement("div",{style:Q},r.a.createElement(u.b,{exact:!0,path:"/",component:J}),r.a.createElement(u.b,{path:"/login",component:V}),r.a.createElement(u.b,{path:"/register",component:W}),r.a.createElement(u.b,{path:"/myBill",component:A}),r.a.createElement(u.b,{path:"/myRoute",component:G}),r.a.createElement(u.b,{path:"/edit/:id",component:K}),r.a.createElement(u.b,{path:"/new_route",component:K}),r.a.createElement(u.b,{path:"/search/:keyWord",component:U}))))))};c.a.render(r.a.createElement(Y,null),document.getElementById("root"))}},[[138,5,6]]]);
//# sourceMappingURL=main.7a1f82ce.chunk.js.map