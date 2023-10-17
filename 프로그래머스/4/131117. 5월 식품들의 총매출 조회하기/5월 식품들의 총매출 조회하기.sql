-- 코드를 입력하세요
-- 식품의 정보를 담은 FOOD_PRODUCT 테이블
    -- 식품 ID*, 식품 이름, 식품코드, 식품분류, 식품 가격
-- 식품의 주문 정보를 담은 FOOD_ORDER 테이블
    -- 주문 ID, 제품 ID*, 주문량, 생산일자, 입고일자, 출고일자, 공장 ID, 창고 ID

-- 생산일자가 2022년 5월인 식품들
-- 식품 ID, 식품 이름, 총매출을 조회
-- 결과는 총매출을 기준으로 내림차순 정렬해주시고 총매출이 같다면 식품 ID를 기준으로 오름차순 정렬

SELECT P.PRODUCT_ID, P.PRODUCT_NAME,
       SUM(P.PRICE * O.AMOUNT) AS TOTAL_SALES
FROM FOOD_PRODUCT P
JOIN FOOD_ORDER O
ON P.PRODUCT_ID = O.PRODUCT_ID
WHERE TO_CHAR(O.PRODUCE_DATE, 'YYMM') = '2205'
GROUP BY P.PRODUCT_ID, P.PRODUCT_NAME
ORDER BY TOTAL_SALES DESC, PRODUCT_ID ASC