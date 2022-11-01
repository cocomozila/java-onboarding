package onboarding;

import java.util.*;

public class Problem7 {
    // 전체 기능 호출
    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        List<String> answer = new ArrayList<>();
        HashMap<String, Integer> idToNumber = new HashMap<>();
        HashMap<Integer, String> numberToId = new HashMap<>();
        HashSet<String> allUserList = getAllUserList(user, friends, visitors);
        HashSet<String> myFriendList = new HashSet<>();
        List<Integer>[] friendGraph;

        // 사용자와 함께 아는 친구의 수만큼 점수 주기위해 인접배열리스트 초기화
        friendGraph = new List[allUserList.size()];
        for (int i = 0; i < allUserList.size(); i++) {
            friendGraph[i] = new ArrayList<>();
        }

        return answer;
    }

    // 나오는 모든계정을 중복제거 후 리스트에 담아 리턴
    private static HashSet<String> getAllUserList(String user, List<List<String>> friends, List<String> visitors) {
        HashSet<String> allUserList = new HashSet<>();
        for (int i = 0; i < friends.size(); i++) {
            allUserList.add(user);
            allUserList.addAll(friends.get(i));
        }
        allUserList.addAll(visitors);
        return allUserList;
    }
}


