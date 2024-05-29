public class OnlineVotingSystem {
    public static void main(String[] args) {
        int candidate1Votes = 0;
        int candidate2Votes = 0;
        int candidate3Votes = 0;

        // Simulating voting process
        candidate1Votes = castVote(candidate1Votes);
        candidate2Votes = castVote(candidate2Votes);
        candidate3Votes = castVote(candidate3Votes);

        // Displaying results
        displayResults(candidate1Votes, candidate2Votes, candidate3Votes);
    }

    public static int castVote(int votes) {
        // Simulating voting action
        return votes + 1;
    }

    public static void displayResults(int candidate1Votes, int candidate2Votes, int candidate3Votes) {
        System.out.println("Voting Results:");
        System.out.println("Candidate 1: " + candidate1Votes + " votes");
        System.out.println("Candidate 2: " + candidate2Votes + " votes");
        System.out.println("Candidate 3: " + candidate3Votes + " votes");

        // Determining the winner
        int maxVotes = Math.max(candidate1Votes, Math.max(candidate2Votes, candidate3Votes));
        if (maxVotes == candidate1Votes) {
            System.out.println("Candidate 1 is the winner!");
        } else if (maxVotes == candidate2Votes) {
            System.out.println("Candidate 2 is the winner!");
        } else {
            System.out.println("Candidate 3 is the winner!");
        }
    }
}

