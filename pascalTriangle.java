class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        
        
        if (numRows == 1) {
            List<Integer> rowToAdd = new ArrayList<>();
            rowToAdd.add(1);
            pascalTriangle.add(rowToAdd);
            return pascalTriangle;
        } else if (numRows == 2) {
            List<Integer> rowToAdd = new ArrayList<>();
            rowToAdd.add(1);
            pascalTriangle.add(rowToAdd);
            
            List<Integer> rowToAdd2 = new ArrayList<>();
            rowToAdd2.add(1); //rowToAdd = {1,1}
            rowToAdd2.add(1);
            pascalTriangle.add(rowToAdd2);
            return pascalTriangle;
        } else if (numRows <= 0) {
            return pascalTriangle; 
        } else {
            List<Integer> rowToAdd = new ArrayList<>();
            rowToAdd.add(1);
            pascalTriangle.add(rowToAdd);
            
            List<Integer> rowToAdd2 = new ArrayList<>();
            rowToAdd2.add(1); //rowToAdd = {1,1}
            rowToAdd2.add(1);
            pascalTriangle.add(rowToAdd2);
            
            for(int i = 1; i < numRows - 1; i++) {
                List<Integer> row = new ArrayList<>();
                List<Integer> prevRow = pascalTriangle.get(i);
                row.add(1);
                for(int j = 0; j < prevRow.size() - 1; j++) {
                    row.add(prevRow.get(j) + prevRow.get(j + 1));
                }
                row.add(1);
                pascalTriangle.add(row);
            }
            return pascalTriangle;
            
        }
        
    }
}
