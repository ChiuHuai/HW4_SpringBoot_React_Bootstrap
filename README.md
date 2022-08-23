<a name="huai's readme-top"></a>
# HW4_SpringBoot_React_Bootstrap

<!-- ABOUT THE PROJECT -->
## About The Project
8/19(Fri.) 的[回家作業](https://hackmd.io/@kazzy/S1K5Lu5R9)，:arrow_down:

將 8/12 的課堂實作（user）串上前端

本作業使用 HTML 5 + CSS + JS 撰寫前端畫面以及功能，框架為React及Bootstrap，功能呼叫後端 API 回傳資料，連接資料庫為MySQL。

<!-- GETTING STARTED -->
## Getting Started

1.將此專案下載或clone後，在 IDE 打開 pom.xml。

2.開啟 Postman，import HW3-1_H2_JPA.postman_collection.json

3.回到 IDE ，執行src/main/java/com.HW4_SpringBoot_React 內的 Hw4SpringBootReactApplication

4.至 Postman 操作此專案

* 取得所有 user 清單 http://localhost:8080/api/HW4/v1/user
* 根據ID取得 user 資料 http://localhost:8080/api/HW4/v1/user/:id
* 新增 user 至清單 http://localhost:8080/api/HW4/v1/user
* 修改 user 資料 http://localhost:8080/api/HW4/v1/user
* 刪除 user 資料 http://localhost:8080/api/HW4/v1/user/:id

5.連線至MySQL查看資料

6.前端介面操作

在 VScode 內的 terminal: 

cd 到 hw4-springboot-react-front 資料夾位置

npm install

npm start

瀏覽器: http://localhost:3000/

<img width="500" alt="Screen Shot 2022-08-23 at 1 36 10 AM" src="https://user-images.githubusercontent.com/80444687/185990759-585279ce-7f73-47f8-8512-f234b5222d57.png">

* Find User By ID: 無值，下方表格會顯示所有 user 資料
* Find User By ID: 直接輸入值，有找到 ID 下方表格會顯示 user 資料
* Add User:  新增 user 至清單
* Update: 修改 user 資料
* Delete: 刪除 user 資料




<p align="right">(<a href="#huai's readme-top">back to top</a>)</p>

<!-- CONTACT -->
## Contact

Huai Chiu - huaichiu@systex.com

<p align="right">(<a href="#huai's readme-top">back to top</a>)</p>
