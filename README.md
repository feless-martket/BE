<div align="center">



## Backend - Reamd.me  ✅

[<img src="https://img.shields.io/badge/프로젝트 기간-2024.12.09~2025.01.31-green?style=flat&logo=&logoColor=white" />]()

</div> 

### 📝 소개
백엔드 깃 레파지토리의 README.md를 빠르게 작성하기 위해 만든 템플릿입니다.


- 프로젝트 소개
- 주요 기능
- 프로젝트 화면 구성 또는 프로토 타입
- 프로젝트 API 설계
- 사용한 기술 스택
- 디렉터리 구조
- 기술적 이슈와 해결 과정
- 브랜치 전략
- 커밋 메세지
- 프로젝트 팀원

<br />

## 1. 📃 프로젝트 소개
- 프로젝트 이름: FEless-Market(간편한 온라인 식료품 쇼핑 플랫폼)
- 소개: 이 프로젝트는 사용자에게 신선한 식료품과 생활용품을 간편하게 구매할 수 있는 경험을 제공하는 온라인 쇼핑 플랫폼입니다. 사용자 친화적인 인터페이스와 효율적인 장바구니 및 결제 시스템을 통해 마켓컬리와 유사한 기능을 구현합니다.
<br />

## 2. 주요 기능
- 상품 리스트 및 검색:
  - 신선식품, 가공식품, 생활용품 등의 카테고리 제공.
  - 키워드 검색 및 필터링 기능.
  
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
  - 간편 재주문 기능 지원.

<br />

## 3. 📷 프로토 타입

<br />

## 4. 🗂 APIs
작성한 API는 아래에서 확인할 수 있습니다.

👉🏻 [API 바로보기](/backend/APIs.md)


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
├── public/
│   ├── index.html           # HTML 템플릿 파일
│   └── favicon.ico          # 아이콘 파일
├── src/
│   ├── assets/              # 이미지, 폰트 등 정적 파일
│   ├── components/          # 재사용 가능한 UI 컴포넌트
│   ├── hooks/               # 커스텀 훅 모음
│   ├── pages/               # 각 페이지별 컴포넌트
│   ├── App.js               # 메인 애플리케이션 컴포넌트
│   ├── index.js             # 엔트리 포인트 파일
│   ├── index.css            # 전역 css 파일
│   ├── firebaseConfig.js    # firebase 인스턴스 초기화 파일
│   package-lock.json    # 정확한 종속성 버전이 기록된 파일로, 일관된 빌드를 보장
│   package.json         # 프로젝트 종속성 및 스크립트 정의
├── .gitignore               # Git 무시 파일 목록
└── README.md                # 프로젝트 개요 및 사용법
```

<br/>


<br />

## 7. 🤔 기술적 이슈와 해결 과정



<br />

## 8. 🧑🏻‍💻 브랜치 전략 (Branch Strategy)
우리의 브랜치 전략은 Git Flow를 기반으로 하며, 다음과 같은 브랜치를 사용합니다.

- Main Branch
  - 배포 가능한 상태의 코드를 유지합니다.
  - 모든 배포는 이 브랜치에서 이루어집니다.
  
- {name} Branch
  - 팀원 각자의 개발 브랜치입니다.
  - 모든 기능 개발은 이 브랜치에서 이루어집니다.

<br/>

## 9. 📣 커밋 메세지 

<br/>

## 10. 💁‍♂️ 프로젝트 팀원 및 역할 분담
|Backend|Backend|Backend|
|:---:|:---:|:---:|
| ![](https://github.com/yoonhyojin.png?size=120) | ![](https://github.com/SangHyun-e.png?size=120) | ![](https://github.com/Shinjunhoon.png?size=120) |
|[윤효진](https://github.com/yoonhyojin)|[천상현](https://github.com/SangHyun-e)|[신정훈](https://github.com/Shinjunhoon)|




