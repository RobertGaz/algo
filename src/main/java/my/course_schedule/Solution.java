package my.course_schedule;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {

    // алгоритм Кана для топологической сортировки - то есть для упорядоченного выбора вершин графа
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        Set<Integer>[] needForCourse = new Set[numCourses];
        for (int i = 0; i < numCourses; i++) {
            needForCourse[i] = new HashSet<>();
        }

        for (int i = 0; i < prerequisites.length; i++) {
            int[] prerequisite = prerequisites[i];
            needForCourse[prerequisite[0]].add(prerequisite[1]);
        }

        boolean[] chosen = new boolean[numCourses];

        while (true) {
            // choose course which can be taken at this point
            int elem;
            boolean foundElem = false;
            for (elem = 0; elem < numCourses; elem++) {
                if (chosen[elem]) {
                    continue;
                }
                if (needForCourse[elem].isEmpty()) {
                    foundElem = true;
                    break;
                }
            }

            if (!foundElem) {
                for (int i = 0; i < numCourses; i++) {
                    if (!chosen[i]) {
                        return false;
                    }
                }
                return true;
            }

            chosen[elem] = true;
            for (int i = 0; i < numCourses; i++) {
                needForCourse[i].remove(elem);
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(canFinish(2, new int[][]{new int[]{1, 0}}));
    }
}