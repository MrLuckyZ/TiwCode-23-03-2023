package Election;

public class Test {
    public static void main(String[] args) {
        ElectionSystem v = new ElectionSystem();
        v.sendVoteGroupA(10);
        v.sendVoteGroupB(0);
        v.summaryVote();
    }
}
