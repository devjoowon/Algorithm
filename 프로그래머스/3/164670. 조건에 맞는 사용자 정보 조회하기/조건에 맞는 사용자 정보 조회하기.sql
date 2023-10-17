-- 코드를 입력하세요
-- 중고 거래 게시판 정보를 담은 USED_GOODS_BOARD 테이블
    -- 게시글 ID, 작성자 ID*, 게시글 제목, 게시글 내용, 가격, 작성일, 거래상태, 조회수
-- 중고 거래 게시판 첨부파일 정보를 담은 USED_GOODS_USER 테이블
    -- 회원 ID*, 닉네임, 시, 도로명 주소, 상세 주소, 전화번호

-- 중고 거래 게시물을 3건 이상 등록한 사용자
-- 사용자 ID, 닉네임, 전체주소, 전화번호를 조회
-- 이때, 전체 주소는 시, 도로명 주소, 상세 주소가 함께 출력되도록
-- 전화번호의 경우 xxx-xxxx-xxxx 같은 형태로 하이픈 문자열(-)을 삽입하여 출력
-- 결과는 회원 ID를 기준으로 내림차순 정렬

SELECT USER_ID,
       NICKNAME,
       CITY||' '||STREET_ADDRESS1||' '||STREET_ADDRESS2 AS 전체주소, 
       SUBSTR(TLNO,1,3)||'-'||SUBSTR(TLNO,4,4)||'-'||SUBSTR(TLNO,8,4) AS 전화번호
FROM USED_GOODS_USER
WHERE USER_ID IN (SELECT WRITER_ID
                  FROM USED_GOODS_BOARD
                  GROUP BY WRITER_ID
                  HAVING COUNT(WRITER_ID) >= 3)
ORDER BY USER_ID DESC;