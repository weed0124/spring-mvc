package practice.springmvc.domain.board.notrecommend;

import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class NotRecommendRepository {
    private static final Map<Long, NotRecommend> store = new ConcurrentHashMap<>();
    private static long sequence = 0L;

    public NotRecommend save(NotRecommend rec) {
        rec.setId(++sequence);
        store.put(rec.getId(), rec);
        return rec;
    }

    public NotRecommend findById(Long id) {
        return store.get(id);
    }

    public List<NotRecommend> findByBoardId(Long boardId) {
        Period p = Period.between(LocalDate.now(), LocalDate.now());
        return new ArrayList<>(store.values()).stream()
                .filter(nrec -> nrec.getBoardId() == boardId
                        && Period.between(nrec.getRegistDate(), LocalDate.now()).getDays() == 0).toList();
    }

    public List<NotRecommend> findByNickname(String nickname) {
        return new ArrayList<>(store.values()).stream()
                .filter(nrec -> nrec.getMember().getNickname().equals(nickname)
                        && Period.between(nrec.getRegistDate(), LocalDate.now()).getDays() == 0).toList();
    }
}