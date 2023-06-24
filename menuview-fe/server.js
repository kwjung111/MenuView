const express = require('express')
const cors = require('cors')
const app = express()

const server = require('http').createServer(app);
const path = require('path')
const port = 3000;

//const routes = require('./routes.js')
//app.use(routes)


//CORS 사용
app.use(cors());

app.use((res,req,next) =>{
    express.static(path.join(__dirname,'/public'));
    next();
});
//next 로 제어권 넘겨줘야함!

app.get('/api', (req,res) => {
    res.send({msg:'api called!'})
});
//백엔드 연동 코드
//setupProxy.js 참고
//와일드 카드 get 보다 위에 있어야 제대로 동작

app.get('*', (req,res) => {
    res.sendFile(path.join(__dirname, '/public/main.html'))
});
//리액트는 react-router-dom 으로 라우팅하기 때문에 서버가 라우팅할 필요 X
//리액트 프로젝트 내에서 라우팅한다.
//하지만 url 로 접근할 시, 클라이언트단에서 해당 url을 찾을 수 없어 라우팅 불가능
//미들웨어가 index 페이지로 라우팅 해줘야함




server.listen(port, ()=>{
    console.log('server is running on ' + port);
});
//서버 실행시 호출