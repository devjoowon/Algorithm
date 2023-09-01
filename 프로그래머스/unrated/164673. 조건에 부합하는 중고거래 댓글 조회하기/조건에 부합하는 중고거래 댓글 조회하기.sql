-- 코드를 입력하세요
SELECT b.title,
        r.board_id,
        r.reply_id,
        r.writer_id,
        r.contents,
        TO_CHAR(r.created_date, 'YYYY-MM-DD')
FROM used_goods_reply r
JOIN used_goods_board b
ON r.board_id = b.board_id
WHERE TO_CHAR(b.created_date,'YYYY-MM') = '2022-10'
ORDER BY r.created_date asc, b.title asc;