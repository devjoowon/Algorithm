-- 코드를 입력하세요
-- 아이스크림 가게의 상반기 주문 정보를 담은 FIRST_HALF 테이블
    --  아이스크림 공장에서 아이스크림 가게까지의 출하 번호(외래키), 아이스크림 맛(기본키), 상반기 아이스크림 총주문량
-- 7월의 아이스크림 주문 정보를 담은 JULY 테이블
    --  아이스크림 공장에서 아이스크림 가게까지의 출하 번호, 아이스크림 맛, 7월 아이스크림 총주문량

-- 7월에는 아이스크림 주문량이 많아 같은 아이스크림에 대하여 서로 다른 두 공장에서 아이스크림 가게로 출하를 진행하는 경우가 있습니다. 이 경우 같은 맛의 아이스크림이라도 다른 출하 번호를 갖게 됩니다.

-- 7월 아이스크림 총 주문량과 상반기의 아이스크림 총 주문량을 더한 값이 큰 순서대로 상위 3개의 맛을 조회
    -- ROW_NUMBER() OVER(ORDER BY 총주문량) AS ROW_NUM 해놓고 ROW_NUM <= 3 하기

SELECT FLAVOR
FROM (SELECT F.FLAVOR, SUM(F.TOTAL_ORDER + J.TOTAL_ORDER)
      FROM FIRST_HALF F
      JOIN JULY J
      ON F.FLAVOR = J.FLAVOR
      GROUP BY F.FLAVOR
      ORDER BY SUM(F.TOTAL_ORDER + J.TOTAL_ORDER) DESC)
WHERE ROWNUM <= 3