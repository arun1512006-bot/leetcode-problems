class Solution {
public:
    vector<string> readBinaryWatch(int turnedOn) {
        std::vector<std::string>ans;
        for(int i=0;i<12;i++){
            for(int j=0;j<60;j++){
                if(__builtin_popcount(i)+__builtin_popcount(j)==turnedOn){
                    std::string min=(j<10)? "0"+std::to_string(j):std::to_string(j);
                    ans.push_back(std::to_string(i)+":"+min);
                }
            }
        }
        return ans;
    }
};