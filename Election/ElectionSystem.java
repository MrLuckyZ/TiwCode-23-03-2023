package Election;

public class ElectionSystem {
    private static int groupA = 0;
    private static int groupB = 0;
    
    public void sendVoteGroupA(int vote){
        groupA += vote;
        System.out.println("You vote A : "+vote+" Vote");
    }

    public void sendVoteGroupB(int vote){
        groupA += vote;
        System.out.println("You vote B : "+vote+" Vote");
    }

    public void summaryVote(){
        if(groupA>groupB){
            System.out.println("Group A is the new NAYOK");
        }else{
            System.out.println("Group B is the new NAYOK");
        }
        System.out.println("All Vote is : "+(groupA+groupB));
    }
}
