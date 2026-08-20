class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer,List<Integer>> map = new HashMap();
        int[] course = new int[numCourses];

        for(int[] requi : prerequisites)
        {
            map.computeIfAbsent(requi[1], key -> new ArrayList<Integer>()).add(requi[0]);
        }

        for(int i=0;i<numCourses;i++)
        {
            if(course[i]==0)
            {
                if(!dfs(course,i,map))
                {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean dfs(int[] course, Integer i, Map<Integer,List<Integer>> map)
    {
        if(course[i]==2)return true;
        if(course[i]==1)return false;

        course[i]=1;
        for(int val : map.getOrDefault(i,new ArrayList<Integer>()))
        {
            if(!dfs(course,val,map))
            {
                return false;
            }
        }

        course[i]=2;
        return true;
    }
}
