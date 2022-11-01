package com.LeetCode.Arrays;

// [Maximum Population Year](https://leetcode.com/problems/maximum-population-year/)
import java.util.Arrays;

public class MaximumPopulationYear {
    public static void main(String[] args) {
//        int[][] logs = {{1950, 1961},{1960, 1971},{1970,1981}};
        int[][] logs = {{2044,2049},{2020,2044},{1958,2024},{1990,2007},{1962,1980},{1997,2050},{2005,2033},{2028,2035},
            {2035,2040},{2022,2035},{1971,2047},{1967,1994},{1952,1976},{1967,2030},{2014,2045},{2039,2049},{1951,2001},
            {2003,2008},{1991,2001},{1995,2002},{2039,2043},{2036,2048},{1960,1970},{2015,2048},{2048,2049},{1979,1989},{2013,2039},
            {2048,2050},{1969,2031},{1971,2045},{1995,2024},{1981,2028},{2016,2027},{2036,2039},{1954,2021},{2033,2040},{2040,2041},{1973,1980},
                {2028,2036},{1968,1989},{2022,2038},{1954,1961},{2047,2049},{2012,2036},{2039,2045},{2044,2048},{1957,1989},{2027,2038},{1978,2026},
                    {2025,2037},{2024,2041},{1989,2026},{2023,2026},{1983,1992},{2038,2049},{1951,1989},{2021,2048},{2027,2036},{2000,2029},{2014,2032},{2010,2022},{2027,2038},{1977,1989},{1982,2022},{1954,2048},{2034,2045},{2022,2045},{1977,2018},{2023,2033},{1976,2006},{2019,2045},{1996,2028},{1975,2031},{1988,2043},{2006,2048},{2011,2047},{2019,2039},{2012,2039},{2011,2033},{1952,1973},{1985,2031},{1961,2018},{1980,2050},{1950,1976},{2031,2039},
                        {1996,2002},{2016,2029},{1988,2009},{1970,2008},{1956,1971},{1956,2049},{1959,1995},{2021,2033},
                        {2000,2023},{1990,2033},{1979,2017},{1991,2006},{2005,2034},{2015,2038},{2047,2048}};
        int maxPopulationYear = maxpopu(logs);
        System.out.println(maxPopulationYear);
    }
    static int maxpopu(int[][] logs){
        //making range of our years for ans
        //according to the question range of years will be (1950 , 2050{
        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;

        //now find end such that it is a max year in all the given years
        for (int[] log: logs) {
            if(log[1] > end){end = log[1];}
            if(log[0] < start){
                start = log[0];
            }



        }

        //here our range of years is {start , end}
        int [] values = new int[end - start + 1];

//        System.out.println(Arrays.toString(range) + " RANGE BEFORE ");

        for (int[] log : logs) {
            //form bith year to death  year - 1 of the ith adding +1
            //range of ith person is (log[0], log[1])
            int s = log[0] - start;
            int e = log[1] - start;
            //one person born and exits till he dies for he/she contributes to the total population and decrease the popultaion when dies
            for (int j = s; j < e; j++) {
                values[j]++;
            }

            //one person dies here
//            System.out.println(e + "  " + log[0] + "  " + log[1]);

//            values[e]--;
            System.out.println(Arrays.toString(values));

        }
//                System.out.println(Arrays.toString(range) + " RANGE AFTER ");

        int MaxPop = 1;
        int year = start;

        for (int i = 0; i < values.length; i++) {
            if(values[i] > MaxPop){
                year  = i + start ;
                MaxPop = values[i];
            }
            if(values[i] == MaxPop && i + start < year ){
                year = i + start;
            }

        }
        System.out.println(values[1960 - start] + " " + values[1970 - start]);
        return year;
    }
}
