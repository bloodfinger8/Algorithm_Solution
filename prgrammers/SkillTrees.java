package prgrammers;

import java.util.ArrayList;

public class SkillTrees {
	
	public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for(int i=0; i<skill_trees.length; i++) {
        	boolean sw = true;
        	
        	//한글자씩 쪼개서 배열에 넣었다
        	String[] skills = skill_trees[i].split(""); // 스킬트리
        	int cnt = 0;
        	
        	for(int j=0; j<skills.length; j++) {
        		if(cnt < skill.indexOf(skills[j])) { //인덱스를 반환 없다면 -1 반환
        			sw = false;
        			break;
        		}else if(cnt == skill.indexOf(skills[j])) {
        			cnt++;
        		}
        	}
        	if(sw) {
        		answer++;
        	}
        }
        
        return answer;
    }
	
	
	
	public static void main(String[] args) {
		SkillTrees st = new SkillTrees();
		String []skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		int a =st.solution("CBD", skill_trees);
		System.out.println(a);
	}
}
