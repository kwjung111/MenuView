const {createProxyMiddleWare} = require('http-proxy-middleware');

module.exports = function(app){
    app.use(
        createProxyMiddleware("/api",{
            target:"http://localhost:3000/",    //통신할 서버 주소
            changeOrigin:true,
        })
    )
}