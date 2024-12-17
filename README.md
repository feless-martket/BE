<div align="center">



## Backend - Reamd.me  ✅
[<img src="https://img.shields.io/badge/-notion-blue?style=flat&logo=google-chrome&logoColor=white" />](https://www.notion.so/softsquarededu/555bd4a05f084ed3bdaabe8c4a14fe06)
[<img src="https://img.shields.io/badge/프로젝트 기간-2024.12.09~2025.01.31-green?style=flat&logo=&logoColor=white" />]()

</div> 

### 📝 소개

- 프로젝트 소개
- 주요 기능
- 프로젝트 화면 구성 또는 프로토 타입
- 프로젝트 API 설계
- 사용한 기술 스택
- 디렉터리 구조
- 기술적 이슈와 해결 과정
- 브랜치 전략
- 상세 작업 절차
- 프로젝트 팀원

<br />

## 1. 📃 프로젝트 소개
- 프로젝트 이름: FEless-Market(간편한 온라인 식료품 쇼핑 플랫폼)
- 소개: 이 프로젝트는 사용자에게 신선한 식료품과 생활용품을 간편하게 구매할 수 있는 경험을 제공하는 온라인 쇼핑 플랫폼입니다. 사용자 친화적인 인터페이스와 효율적인 장바구니 및 결제 시스템을 통해 마켓컬리와 유사한 기능을 구현합니다.
<br />

## 2. 주요 기능
- 로그인 및 회원가입:
  - 카카오 연동을 통한 로그인, 회원가입 가능.
  -  아이디, 비밀번호 찾기 기능.
    
- 상품 리스트 및 검색:
  - 신선식품, 가공식품, 생활용품 등의 카테고리 제공.
  - 키워드 검색 및 필터링 기능.
  - 급상승 검색어 리스트 제공.
  
- 상품 상세 페이지:
  - 상품 설명, 리뷰, 가격, 배송 정보 제공.
  - 바로 구매 또는 장바구니 담기 옵션 제공.

- 장바구니:
  - 장바구니에 담긴 상품 확인 및 수량 변경.
  - 선택한 상품만 결제 가능.

- 결제 시스템:
  - 다양한 결제 수단 지원(카드, 간편결제 등).
  - 결제 완료 후 주문 내역 확인 가능.

- 사용자 편의 기능:
  - 최근 본 상품, 찜 목록 제공.
  - 교환 및 환불 문의 기능.
    

<br />

## 3. 📷 프로토 타입

<br />

## 4. 🗂 APIs
작성한 API는 노션에서 확인할 수 있습니다.

👉🏻 [API 바로보기](https://www.notion.so/softsquarededu/555bd4a05f084ed3bdaabe8c4a14fe06)


<br />

## 5. ⚙ 기술 스택 Back-end
<div>
<img src="https://github.com/yewon-Noh/readme-template/blob/main/skills/Java.png?raw=true" width="80">
<img src="https://github.com/yewon-Noh/readme-template/blob/main/skills/SpringBoot.png?raw=true" width="80">
<img src="https://github.com/yewon-Noh/readme-template/blob/main/skills/SpringSecurity.png?raw=true" width="80">
<img src="https://github.com/yewon-Noh/readme-template/blob/main/skills/SpringDataJPA.png?raw=true" width="80">
<img src="https://github.com/yewon-Noh/readme-template/blob/main/skills/Mysql.png?raw=true" width="80">
<img src="https://github.com/yewon-Noh/readme-template/blob/main/skills/Ajax.png?raw=true" width="80">
<img src="https://github.com/yewon-Noh/readme-template/blob/main/skills/Thymeleaf.png?raw=true" width="80">
</div>

### Infra
<div>
<img src="https://github.com/yewon-Noh/readme-template/blob/main/skills/AWSEC2.png?raw=true" width="80">
</div>

### Tools
<div>
<img src="https://github.com/yewon-Noh/readme-template/blob/main/skills/Github.png?raw=true" width="80">
<img src="https://github.com/yewon-Noh/readme-template/blob/main/skills/Notion.png?raw=true" width="80">
</div>

<br />

## 6. 🛠️ 디렉토리 구조
```plaintext
project/
├── controller/
│   ├── UserController          # 
│   └── ProductContoller          # 
├── service/
│   ├── 
│   ├── 
│   ├── 
│   ├── 
├── repositroty/
├── .env
├── .gitignore               # Git 무시 파일 목록
├── build.gradle
└── README.md                # 프로젝트 개요 및 사용법
```

<br/>


<br />

## 7. 🤔 기술적 이슈와 해결 과정



<br />

## 8. 🧑🏻‍💻 프로젝트 GitFlow 브랜치 전략
우리의 브랜치 전략은 Git Flow를 기반으로 하며, 다음과 같은 브랜치를 사용합니다.
<br/>

## 브랜치 구조 및 용도
### 1. main
- 목적: 안정적인 릴리즈 버전 유지.
- 사용: 릴리즈된 버전의 코드 저장소. 최종 사용자에게 배포되는 코드.
### 2. develop
- 목적: 다음 릴리즈 준비를 위한 개발 진행.
- 사용: 모든 개발이 이루어지는 기본 브랜치. 이곳에서 분기된 feature 브랜치가 병합되고, 준비된 코드는 release 브랜치로 이동.
### 3. feature
- 목적: 새 기능 개발, 기존 기능의 개선 및 버그 수정.
- 사용: develop 브랜치에서 분기하여 사용. 각 기능 또는 버그 수정에 대해 별도의 브랜치를 생성.
- 방법: feature/{기능 요약} 혹은 feature/{issue-number}-{기능 요약}
### 4. hotfix
- 목적: 릴리즈된 버전에서 발견된 긴급한 문제 해결.
- 사용: main 브랜치에서 직접 분기하여 긴급 수정 후 main과 develop에 병합.
- 방법: hotfix-{버전}


<br/>

## 9. 📣 상세 작업 절차

### 새 기능 개발
**1. 브랜치 생성:**
```bash
Copy code
git checkout develop
git pull origin develop
git checkout -b feature/기능명
```

**2. 개발 작업 수행 후 커밋:**

```bash
Copy code
git add .
git commit -m "feat: 기능명에 대한 설명"
```

**3. commit convention**
   
- feat : 새로운 기능 추가
- fix : 버그 수정
- renameL 파일 혹은 폴더명만 수정한 경우
- remove: 파일을 삭제한 경우
- style : 코드 formatting, 세미콜론(;) 누락, 코드 변경이 없는 경우
- test : 테스트 코드, 리팩토링 테스트 코드 추가


**4. 개발 브랜치로 병합 요청 (Pull Request)**
- develop 브랜치로 Pull Request 생성.
- 동료의 코드 리뷰 후 병합 승인.

### 긴급 수정 (Hotfix)

1. Hotfix 브랜치 생성:
```bash
Copy code
git checkout main
git pull origin main
git checkout -b hotfix/버그명
```
2. 버그 수정 및 커밋:
``` bash
Copy code
git add .
git commit -m "01 hotfix: 버그명에 대한 설명"
```
3. 병합 및 배포:
```bash
git push origin hotfix/버그명
```

<br/>

## 10. 💁‍♂️ 프로젝트 팀원 및 역할 분담
|Backend|Backend|Backend|Backend|
|:---:|:---:|:---:|:---:|
| ![](https://github.com/yoonhyojin.png?size=120) | ![](https://github.com/SangHyun-e.png?size=120) | ![](https://github.com/Shinjunhoon.png?size=400) | ![](https://github.com/HongHJ0225.png?size=120) |
|[윤효진](https://github.com/yoonhyojin)|[천상현](https://github.com/SangHyun-e)|[신정훈](https://github.com/Shinjunhoon)|[홍혁진](https://github.com/HongHJ0225)|
