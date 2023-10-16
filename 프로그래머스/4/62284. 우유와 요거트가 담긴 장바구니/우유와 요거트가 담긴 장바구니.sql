-- 코드를 입력하세요
-- CART_PRODUCTS 테이블은 장바구니에 담긴 상품 정보를 담은 테이블
SELECT DISTINCT CART_ID
FROM CART_PRODUCTS
WHERE NAME = 'Milk'
AND CART_ID IN (SELECT CART_ID
                FROM CART_PRODUCTS
                WHERE NAME = 'Yogurt')
ORDER BY CART_ID