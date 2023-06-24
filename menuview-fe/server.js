const express = require('express')
const cors = require('cors')
const app = express()

const server = require('http').createServer(app);
const path = require('path')
const port = 3000;


//CORS 사용
app.use(cors());

app.use(express.static(path.join(__dirname,'/public')));

app.get('*', (req,res) => {
    res.sendFile(path.join(__dirname, '/public/index.html'))
});
//리액트는 react-router-dom 으로 라우팅하기 때문에 서버가 라우팅할 필요 X
//리액트 프로젝트 내에서 라우팅한다.

app.get('/api', (req,res) => {
    res.send({msg:'api called!'})
});
//백엔드 연동 코드 작성예정
//setupProxy.js 참고


server.listen(port, ()=>{
    console.log('server is running on ' + port);
});
//서버 실행시 호출