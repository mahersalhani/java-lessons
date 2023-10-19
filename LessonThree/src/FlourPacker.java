public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0) {
            return false;
        }

        int bigCountWeight = bigCount * 5;
        int smallCountWeight = smallCount;

        if (bigCountWeight + smallCountWeight < goal) {
            return false;
        }

        if (bigCountWeight + smallCountWeight == goal) {
            return true;
        }

        if (bigCountWeight + smallCountWeight > goal) {
            if (bigCountWeight > goal) {
                return false;
            }

            if (bigCountWeight < goal) {
                int remainder = goal - bigCountWeight;
                if (remainder > smallCountWeight) {
                    return false;
                }
            }
        }

        return true;
    }
}
