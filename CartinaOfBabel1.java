import java.util.*;

public class CartinaOfBabel1 {

    
    static Map<String,Set<String>> nameToUnderstand;
    static Map<String,Set<String>> adList;
    static Map<String,String> speaks;
    static Map<String,Set<String>> understandAll;
    static Map<String,Set<String>> commuteMap;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();sc.nextLine();
        nameToUnderstand=new HashMap();
        adList=new HashMap();
        speaks=new HashMap();
        understandAll=new HashMap();
        commuteMap=new HashMap();
        for(int l=0;l<n;l++){
        String line=sc.nextLine();
        String list[]=line.split(" ");
        String name=list[0];
        String speak=list[1];speaks.put(name,speak);
        Set understand=new HashSet();
        understand.add(speak);
        for(int r=0;r<list.length;r++){
            if(r>=2)understand.add(list[r]);
        }
        nameToUnderstand.put(name, understand);
        for(Map.Entry<String,Set<String>> entry:nameToUnderstand.entrySet()){
            String personName=entry.getKey();
            Set languageUnderstood=entry.getValue();
            Set peopleUnderstood=new HashSet();
            for(Map.Entry<String,String> entry2:speaks.entrySet()){
            if(languageUnderstood.contains(entry2.getValue())){
            peopleUnderstood.add(entry2.getKey());
            }
            
            }
            adList.put(personName,peopleUnderstood);
        }
          for(Map.Entry<String,Set<String>> entry:adList.entrySet()){
              Set set=new HashSet();
              String person=entry.getKey();
              Queue<String> q=new LinkedList();
              q.add(person);
              while(!q.isEmpty()){
              String s=q.remove();
              Set<String> tempSet=adList.get(s);
                  if (tempSet == null) {
                      continue;
                  } else {
                      for (String neighbor : tempSet) {
                          if (!set.contains(neighbor)) {
                              q.add(neighbor);
                              set.add(neighbor);
                          }
                      }
                  }
              }
                understandAll.put(person, set);
              }
          }
        for(Map.Entry<String,Set<String>> entry3:understandAll.entrySet()){
            String key=entry3.getKey();
            Set<String> value=entry3.getValue();
            Set mySet=new HashSet();
            for(String myS:value){
                if(understandAll.get(myS).contains(key)){
                mySet.add(myS);
                }
       }
            commuteMap.put(key, mySet);
        }
        int max = 0;
        for (Map.Entry<String, Set<String>> entry5 : commuteMap.entrySet()) {
            if (entry5.getValue().size() > max) {
                max = entry5.getValue().size();
            }
        }
        System.out.println(n - max);
    }

}
