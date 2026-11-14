# OOP 모의투자 게임

사용자 1명과 규칙 기반 봇 4명이 가상 시장에서 경쟁하는 Java 콘솔 게임이다. 모든 참가자는 1,000만 원으로 시작한다. 기본 게임은 5일간 하루 7턴으로 진행하며, 마지막 가격 갱신 후 현금과 보유 종목의 평가액을 합산해 순위를 정한다.

## 개발 환경

- JDK 21, Maven, JUnit 5, IntelliJ IDEA
- 협업 저장소 [wlxoqkdl/OOP_Investment_Game](https://github.com/wlxoqkdl/OOP_Investment_Game)

## 기본 기능

- 일반 주식 6종부터 시작하여 시세 조회, 현물 매수·매도, 관망, 자산 조회와 거래 내역을 제공한다.
- 매수와 매도에 거래대금의 0.1%를 부과하고 원 단위로 올림한다.
- 참가자마다 턴당 유효 행동은 한 번이다. 한 턴의 참가자는 같은 시세를 사용하며, 모두 행동을 마친 뒤 시장 가격을 한 번 갱신한다.
- 봇은 Random, Conservative, Aggressive, Momentum 전략으로 판단한다.
- 안정화 후 일반 주식 10종과 일반 ETF 2종, 10일 모드를 지원할 계획이다.

## 빌드와 실행

Java 21과 Maven을 설치한 뒤 아래 절차로 골격을 빌드한다.

```sh
git clone https://github.com/wlxoqkdl/OOP_Investment_Game.git
cd OOP_Investment_Game
java -version
mvn -version
mvn clean package
java -jar target/oop-investment-game-0.1.0-SNAPSHOT.jar
```

JDK와 Maven이 사용하는 Java가 모두 21인지 확인한다. IntelliJ에서는 `pom.xml`을 Maven 프로젝트로 열고 `investment.Main`을 실행한다. 콘솔에 게임 제목과 골격 실행 완료 메시지가 표시된다. 계좌·거래·시장·전략과 35턴 게임은 후속 작업이다.

## 패키지 구성

Maven의 표준 구조인 `src/main/java`와 `src/test/java`를 사용한다. 실행 진입점은 `investment.Main`, 게임 진행은 `investment.game`에 둔다. `config`, `market`, `trading`, `player`, `strategy`, `ui`는 해당 기능 작업에서 추가한다.

## 객체지향 설계 계획

- Account가 계좌 상태를 캡슐화하고, TradeService는 스냅샷 시세로 주문을 검증한다.
- HumanPlayer와 BotPlayer는 Player 계층을 사용한다. 봇은 TradingStrategy의 구현체에 판단을 위임한다.
- PriceModel은 다음 가격을 계산하고, Market은 종목 가격과 이력을 갱신한다.

[협업 규칙](CONTRIBUTING.md) · [프로젝트 진행 현황](PROJECT_STATUS.md)
