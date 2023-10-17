-- 코드를 입력하세요
-- 중고거래 게시판 정보를 담은 USED_GOODS_BOARD 테이블
    -- 게시글 ID*, 작성자 ID, 게시글 제목, 게시글 내용, 가격, 작성일, 거래상태, 조회수
-- 중고거래 게시판 첨부파일 정보를 담은 USED_GOODS_FILE 테이블
    -- 파일 ID, 파일 확장자, 파일 이름, 게시글 ID*

-- 조회수가 가장 높은 중고거래 게시물에 대한 첨부파일 경로를 조회
-- 첨부파일 경로는 FILE ID를 기준으로 내림차순 정렬
-- 기본적인 파일경로는 /home/grep/src/
-- 게시글 ID를 기준으로 디렉토리가 구분
-- 파일이름은 파일 ID, 파일 이름, 파일 확장자로 구성되도록 출력
-- '/home/grep/src/'||BOARD_ID||'/'||FILE_ID||FILE_NAME||FILE_EXT

-- 조회수가 가장 높은 게시물은 하나만 존재

-- (SELECT '/home/grep/src/'||BOARD_ID||'/'||FILE_ID||FILE_NAME||FILE_EXT AS FILE_PATH
-- FROM USED_GOODS_FILE)

SELECT '/home/grep/src/'||F.BOARD_ID||'/'||F.FILE_ID||F.FILE_NAME||F.FILE_EXT AS FILE_PATH
FROM USED_GOODS_FILE F
JOIN USED_GOODS_BOARD B
ON F.BOARD_ID = B.BOARD_ID
WHERE B.VIEWS = (SELECT MAX(VIEWS) FROM USED_GOODS_BOARD)
ORDER BY F.FILE_ID DESC