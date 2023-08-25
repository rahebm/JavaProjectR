package class8;

public class E3EnhancedLoop {
    public static void main(String[] args) {
        int [] nums={10,23,25,56,45,20};

        int largest=nums[0]; //this is initializing from within the array

        for (int t:nums){
        if (t>largest){
            largest=t;
            }
        }
        System.out.println(largest);


        }
    }

