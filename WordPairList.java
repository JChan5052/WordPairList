import java.util.ArrayList;
public class WordPairList
{
private ArrayList<WordPair> allPairs;


public WordPairList(String[] words){
ArrayList<WordPair> set=new ArrayList<>();
for (int i=0;i<words.length;i++){
 for (int j=i+1;j<words.length;j++){
set.add(new WordPair(words[i],words[j]));
 }
}
allPairs=set;
}

/** Returns the number of matches as described in part (b).
*/
public int numMatches(){
int matches=0;
for (int i=0;i<allPairs.size();i++){
if ((allPairs.get(i).getFirst()).equals(allPairs.get(i).getSecond())) {
    matches++;
  }
 }
return matches;
}

public String toString(){
    String ret="";
    for (int i=0;i<allPairs.size();i++){
      ret+=allPairs.get(i)+"\n";
    }
    return ret;
}

}