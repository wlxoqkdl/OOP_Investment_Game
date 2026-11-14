# 협업 규칙

협업 저장소는 [wlxoqkdl/OOP_Investment_Game](https://github.com/wlxoqkdl/OOP_Investment_Game)이다. 최현영의 GitHub 계정은 [laflora8482-art](https://github.com/laflora8482-art)다. 초대 수락 및 권한은 확인 대기다.

## 담당

| 팀원 | 주 담당 |
| --- | --- |
| 이진태 | Maven·패키지·Main, Game·GameClock·GameConfig, Market·종목·시장 스냅샷, PriceModel·PriceContext, Player·ConsoleView, TradingStrategy·TradeDecision, RandomStrategy·MomentumStrategy, 시장·게임·해당 전략·통합 테스트, 최종 통합 |
| 최현영 | Account·AccountState·Portfolio·Holding·계좌 스냅샷, Order·Transaction·TradeResult·TradeStatus·TradeService·FeePolicy, ConservativeStrategy·AggressiveStrategy, 계좌·수수료·주문·거래·해당 전략 테스트 |

공유 타입은 소유자가 구현하고 두 사람이 공개 서명, DTO 필드와 타입, 실패 처리, 변경 권한을 검토한다. 각 파일의 주 담당자는 한 명이다. 다른 담당 영역을 수정할 때 변경 이유와 테스트 결과를 PR에 기록하고 소유자의 리뷰를 받는다. 거래 계산과 계좌 상태 변경은 이진태가 리뷰한다.

## 브랜치와 PR

1. 통합 브랜치는 `main`이다. 기능은 `feature/*`, 오류 수정은 `fix/*`에서 진행한다.
2. 작업 범위와 영향받는 클래스를 확인한다. 공개 메서드를 바꾸면 양쪽 호출부를 검토하고 관련 테스트를 실행한다.
3. 작업 브랜치에서 `mvn clean test`로 정상·예외 경로를 확인한다. 문서 PR은 링크와 내용을 확인하고, 골격 PR은 해당 단계에서 실행할 수 있는 빌드·스모크 테스트를 실행한다.
4. `main`을 대상으로 PR을 열고 변경 요약, 공개 계약 변경 여부, 검증 근거와 AI 사용 내역을 남긴다.
5. 작성자 외 팀원 한 명이 리뷰한다. 이진태가 통합 결과를 확인해 병합한다. 실패한 테스트는 병합 전에 해결한다.

## AI 생성 코드

사용 도구와 활용 수준, 생성·수정한 범위, 검토 결과를 남긴다. 작성자가 코드를 설명할 수 있고 컴파일·테스트에 통과한 후 병합한다. API 키와 개인 IDE 설정은 저장소에 올리지 않는다.
