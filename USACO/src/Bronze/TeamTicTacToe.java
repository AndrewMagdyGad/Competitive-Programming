package Bronze;

/*
ID: andrewmagdy
LANG: JAVA
TASK: tttt
 */
import java.io.*;
import java.util.*;
import java.util.StringTokenizer;

public class TeamTicTacToe {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("tttt.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("tttt.out")));
        StringTokenizer st;

        int size = 3;
        char[][] board = new char[size][size];
        boolean[] checkIndividuals = new boolean[26];
        Map<Character, List<Character>> teamMap = new HashMap<>();
        int individuals = 0;
        int teams = 0;

        for (int i = 0; i < size; i++) {
            st = new StringTokenizer(reader.readLine());
            board[i] = st.nextToken().toCharArray();
        }

        for (int i = 0; i < size; i++) {
            // check rows
            if (board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                if (!checkIndividuals[board[i][0] - 'A']) {
                    individuals++;
                }
                checkIndividuals[board[i][0] - 'A'] = true;
            }
            else if (board[i][0] == board[i][1] || board[i][1] == board[i][2] || board[i][0] == board[i][2]) {
                if (formTeam(teamMap, board[i][0], board[i][1], board[i][2]))
                    teams++;
            }

            // check columns
            if (board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
                if (!checkIndividuals[board[0][i] - 'A']) {
                    individuals++;
                }
                checkIndividuals[board[0][i] - 'A'] = true;
            }
            else if (board[0][i] == board[1][i] || board[1][i] == board[2][i] || board[0][i] == board[2][i]) {
                if (formTeam(teamMap, board[0][i], board[1][i], board[2][i]))
                    teams++;
            }
        }

        // check diagonal
        if (board[1][1] == board[0][0] && board[0][0] == board[2][2]) {
            if (!checkIndividuals[board[0][0] - 'A']) {
                individuals++;
            }
            checkIndividuals[board[0][0] - 'A'] = true;
        }
        else if (board[0][0] == board[1][1] || board[1][1] == board[2][2] || board[0][0] == board[2][2]) {
            if (formTeam(teamMap, board[0][0], board[1][1], board[2][2]))
                teams++;
        }

        // check other diagonal
        if (board[1][1] == board[0][2] && board[2][0] == board[0][2]) {
            if (!checkIndividuals[board[2][0] - 'A']) {
                individuals++;
            }
            checkIndividuals[board[2][0] - 'A'] = true;
        }
        else if (board[0][2] == board[1][1] || board[1][1] == board[2][0] || board[0][2] == board[2][0]) {
            if (formTeam(teamMap, board[0][2], board[1][1], board[2][0]))
                teams++;
        }

        out.println(individuals);
        out.println(teams);
        out.close();
    }

    public static boolean formTeam(Map<Character, List<Character>> teamMap, char a, char b, char c) {
        if (a == b)
            return checkTeam(teamMap, a, c);
        return checkTeam(teamMap, a, b);
    }

    public static boolean checkTeam(Map<Character, List<Character>> teamMap, char a, char b) {
        List<Character> listA = teamMap.getOrDefault(a, new ArrayList<>());
        List<Character> listB = teamMap.getOrDefault(b, new ArrayList<>());

        if (listA.contains(b) || listB.contains(a))
            return false;

        listA.add(b);
        listB.add(a);
        teamMap.put(a, listA);
        teamMap.put(b, listB);
        return true;
    }
}
