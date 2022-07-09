    
Grwoth in 2 dimensions

ArrayList<String> UpRight = new ArrayList<>(Arrays.asList("15 24", "19 14", "12 13"));
        int curRow=0, curCol=0, minRow=0, minCol=0;
	String pos0,pos1 ;
        for(int i=0;i<UpRight.size();i++){
            String[] position = UpRight.get(i).split(" ");
            
            // Traverse through Array of Strings 
            for(String c: position){   
                System.out.print(c+" ");
            }
            System.out.println();

            //Array String to String
            pos0  = position[0]; 
            pos1 = position[1];

            //String to int
            curRow = Integer.parseInt(pos0);
            curCol = Integer.parseInt(pos1);

            if(i ==0){
                minRow = curRow;
                minCol = curCol;
                continue;  //To skip next steps and continue loop with next index
            }
            
            if(curRow < minRow) minRow = curRow;
            if(curCol < minCol) minCol = curCol;
        }
        System.out.println();
        System.out.println("res: "+ minRow*minCol);