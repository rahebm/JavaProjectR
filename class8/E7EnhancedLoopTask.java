package class8;

public class E7EnhancedLoopTask {
    public static void main(String[] args) {
        int [] nums={-10,23,25,56,45,20};

        int smallest=nums[0]; //this is initializing from within the array

        for (int t:nums){
        if (t<smallest){
            smallest=t;
            }
        }
        System.out.println(smallest);


        }
    }

