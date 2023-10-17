-- 코드를 입력하세요
-- CART_PRODUCTS 테이블은 장바구니에 담긴 상품 정보를 담은 테이블
    -- 테이블의 아이디, 장바구니의 아이디, 상품 종류, 가격

-- 우유와 요거트를 동시에 구입한 장바구니의 아이디를 조회
-- 결과는 장바구니의 아이디 순으로
SELECT CART_ID
FROM CART_PRODUCTS
WHERE NAME = 'Milk'
INTERSECT
SELECT CART_ID
FROM CART_PRODUCTS
WHERE NAME = 'Yogurt'