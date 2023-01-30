# UniD-Hackathon-Team12-backend

## 🪄서비스 소개
`MZ 세대`를 위한 릴레이 소설 웹페이지
- 본 서비스는 2022 Uni-DTHON 위해 제작되었습니다.
- 여러 사람이 하나의 주제나 스토리 흐름에 맞게 글을 이어서 써 내려갈 수 있도록 하는 서비스입니다. 

[Presentation Slides](https://docs.google.com/presentation/d/1GxK5zKomLM1_FnuK0V7ZoemmqCHrX4uL/edit#slide=id.p1) / [Demo Video](https://drive.google.com/file/d/1OwYN68E1gEp2z1kU-6wfbcV4gsC4XWtN/view?usp=sharing)


<br>

## ⚙️ 시방법
```bash
 git clone https://github.com/UniD-Hackathon-Team12/UniD-Hackathon-Team12-backend.git
```

### 시작하기
```bash
 cd
 ./gradlew build clean
 cd ./build/libs
 java -jar demo-0.0.1-SNAPSHOT.jar
```
<br>


## 📌주요 기능 

<table>
  <tr>
    <td><img width="700" alt="image" src="https://user-images.githubusercontent.com/79784618/200354274-fee4e057-bac2-434d-be24-19dcaae7ba02.png"></td>
    <td><img width="700" alt="image" src="https://user-images.githubusercontent.com/79784618/200354402-acf795e7-073e-4256-aeb0-d211ff9ab82e.png">
</td>
  </tr>
  <tr>
    <td align="center"><b>로그인</b></td>
    <td align="center"><b>회원가입</b></td>
  </tr>
</table>
<table>
  <tr>
    <td><img width="700" alt="image" src="https://user-images.githubusercontent.com/79784618/200354520-c8e85e4f-9605-4f86-adff-0772593ecbe3.png"></td>
  </tr>
  <tr>
    <td align="center"><b>소설 검색(키워드/내용)</b></td>
  </tr>
</table>
<table>
  <tr>
    <td><img width="700" alt="image" src="https://user-images.githubusercontent.com/79784618/200354674-d7fbfd85-e811-41b6-93e7-79ef3da80a69.png"></td>
    <td><img width="700" alt="image" src="https://user-images.githubusercontent.com/79784618/200354756-6a327daa-0155-42e8-b218-baf69babc94e.png"></td>
  </tr>
  <tr>
    <td align="center"><b>카테고리 탭</b></td>
    <td align="center"><b>카테고리 소설</b></td>
  </tr>
</table> 
<table>
  <tr>
    <td><img width="700" alt="image" src="https://user-images.githubusercontent.com/79784618/200354921-14bc2137-ad82-4393-89d5-d9d9bcb1b70f.png"></td>
  </tr>
  <tr>
     <td align="center"><b>소설 시작하기</b></td>
  </tr>
</table>
<table>
  <tr>
    <td><img width="700" alt="image" src="https://user-images.githubusercontent.com/79784618/200355056-ac8cb00b-c3ac-44b4-b6f5-0fad062a378f.png"></td>
    <td><img width="700" alt="image" src="https://user-images.githubusercontent.com/79784618/200355152-d4d54851-e21a-4f03-8423-79d1b4d11d3a.png"></td>
  </tr>
  <tr>
     <td align="center"><b>소설 읽기</b></td>
     <td align="center"><b>소설 이어쓰기</b></td>
  </tr>
</table>
<table>
  <tr>
    <td><img width="700" alt="image" src="https://user-images.githubusercontent.com/79784618/200355272-6da27c5b-1f05-4dee-a511-c0be8498a3bf.png">
</td>
  </tr>
  <tr>
     <td align="center"><b>마이페이지(작성글/참여글/좋아요글)</b></td>
  </tr>
</table>
  <br>

## 💻 Tech Stack
<table class="tg">
<tbody>
  <tr>
    <td><b>BackEnd</b></td>
        <td>
          Spring Boot
        </td>
  </tr>
  <tr>
    <td><b>Database</b></td>
       <td>
         MySQL + RDS
       </td>
  </tr>
  <tr>
  <tr>
    <td><b>배포</b></td>
       <td>
         Amason EC2
       </td>
  </tr>
  <tr>
    <td><b>Strategy</b></td>
       <td>
         RESTful API
       </td>
  </tr>
  <tr>
    <td><b>Other Tool</b></td>
       <td>
         Notion, Slack
       </td>
  </tr>
</tbody>
</table>
<br>

## 👍 시스템 구조

<br>

## 🗂 Floder Map
```bash
* 📦 Novel-Relay-Server
  ├──  .gradle
  ├──  gradle/wrapper
  ├──  logs
  ├──  out/production
  ├──  src
  │   ├──  test/java/com/example/demo
  │   ├──  main
  │   │   ├──  java/com/example/demo
  │   │   │   ├──  config
  │   │   │   │   ├──  secret
  │   │   │   │   │   └──  Secret.java
  │   │   │   │   ├──  BaseException.java
  │   │   │   │   ├──  BaseResponse.java
  │   │   │   │   ├──  BaseExceptionStatus.java
  │   │   │   │   └──  Constant.java
  │   │   │   ├──  src
  │   │   │   │   ├──  controller
  │   │   │   │   │   ├──  KeywordController.java
  │   │   │   │   │   ├──  NovelController.java
  │   │   │   │   │   └──  UserController.java
  │   │   │   │   ├──  dto
  │   │   │   │   │   ├──  request
  │   │   │   │   │   │   ├──  GetAllReq.java
  │   │   │   │   │   │   ├──  GetCategoryReq.java
  │   │   │   │   │   │   ├──  GetMyPageReq.java
  │   │   │   │   │   │   ├──  GetNovelIdReq.java
  │   │   │   │   │   │   ├──  GetNovelListSearchReq.java
  │   │   │   │   │   │   ├──  GetRankReq.java
  │   │   │   │   │   │   ├──  PatchKeywordReq.java
  │   │   │   │   │   │   ├──  PatchLikeReq.java
  │   │   │   │   │   │   ├──  PostNovelReq.java
  │   │   │   │   │   │   ├──  PostRelayReq.java
  │   │   │   │   │   │   ├──  PostSignUpReq.java
  │   │   │   │   │   │   └──  PostSignInReq.java
  │   │   │   │   │   └──  reponse
  │   │   │   │   │   │   ├──  GetAllRes.java
  │   │   │   │   │   │   ├──  GetCategoryRes.java
  │   │   │   │   │   │   ├──  GetMyPageRes.java
  │   │   │   │   │   │   ├──  GetNovelIdRes.java
  │   │   │   │   │   │   ├──  GetNovelListSearchRes.java
  │   │   │   │   │   │   ├──  GetRankRes.java
  │   │   │   │   │   │   ├──  PatchKeywordRes.java
  │   │   │   │   │   │   ├──  PatchLikeRes.java
  │   │   │   │   │   │   ├──  PostNovelRes.java
  │   │   │   │   │   │   ├──  PostRelayRes.java
  │   │   │   │   │   │   ├──  PostSignUpRes.java
  │   │   │   │   │   │   └──  PostSignInRes.java
  │   │   │   │   ├──  entity
  │   │   │   │   │   │   ├──  BaseTimeEntity.java
  │   │   │   │   │   │   ├──  KEYWORD.java
  │   │   │   │   │   │   ├──  KEYWORDRANK.java
  │   │   │   │   │   │   ├──  LIKEINFO.java
  │   │   │   │   │   │   ├──  NOVEL.java
  │   │   │   │   │   │   ├──  RELAY.java
  │   │   │   │   │   │   └──  USER.java
  │   │   │   │   ├──  repository
  │   │   │   │   │   │   ├──  KeywordRankRepository.java
  │   │   │   │   │   │   ├──  KeywordRepository.java
  │   │   │   │   │   │   ├──  LikeInfoRepository.java
  │   │   │   │   │   │   ├──  NovelRepository.java
  │   │   │   │   │   │   ├──  NovelRepositoryCustom.java
  │   │   │   │   │   │   ├──  NovelRepositoryImpl.java
  │   │   │   │   │   │   ├──  RelayRepository.java
  │   │   │   │   │   │   └──  UserRepository.java
  │   │   │   │   ├──  service
  │   │   │   │   │   │   ├──  KeywordRankService.java
  │   │   │   │   │   │   ├──  KeywordService.java
  │   │   │   │   │   │   ├──  LikeInfoService.java
  │   │   │   │   │   │   ├──  NovelService.java
  │   │   │   │   │   │   └──  UserService.java
  │   │   │   │   └──  WebSecurityConfig.java
  │   │   │   ├──  utils
  │   │   │   │   ├──  JWTService.java
  │   │   │   │   ├──  SHA256.java
  │   │   │   │   └──  ValidationRegex.java
  │   │   │   └──  DemoApplication.java
  │   │   └──  resources
  │   │   │   ├──  application.yml
  │   │   │   └──  logback-spring.xml
  ├──  .gitignore
  ├──  build.gradle
  ├──  gradlew
  ├──  gradlew.bat
  └──  setting.gradle
```

<br>

## ⚙️ 개발 환경
### 1. Software requirement
- IntelliJ + Spring Boot

