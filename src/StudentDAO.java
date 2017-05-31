/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vtson
 */
public class StudentDAO {

    Student listSt[] = new Student[10];
    int count = 0;

    public StudentDAO() {
        for (int i = 0; i < 10; i++) {
            listSt[i] = new Student();
        }
    }

    //CRUD
    public Student create(Student s) {
        if (count < 10) {
            listSt[count].setName(s.getName());
            listSt[count].setAge(s.getAge());
            count++;
            return listSt[count - 1];
        } else {
            return null;
        }
    }
    public Student[] addSt(Student s){
        listSt[count] = s;
        count++;
        return listSt;
    }

    public Student[] readAll() {
        Student stR[] = new Student[count];
        for(int i=0;i<count;i++){
            stR[i]=listSt[i];
        }
        return stR;
    }

    public Student[] readByName(String name) {
        //Tao mang int n de chua dung chi so phan tu dc chon cua mang listSt
        int n[] = new int[10];
        int countSt=0;
        for(int i=0;i<count;i++){
            if( name.equals(listSt[i].getName())){
                n[countSt]=i;
                countSt++;
            }
        }
        
        Student sfT[] = new Student[countSt];
        for(int i=0;i<countSt;i++){
            sfT[i]=listSt[n[i]];
        }
        return sfT;
    }

    public void sortByName(Student s[], int count) {
        Student stSort = new Student();
        for(int i=0; i<(count-1) ; i++){
            for(int j=i+1;j<count;j++){
                if ((s[i].getName().compareTo(s[j].getName()))> 0){
                    stSort=s[i];
                    s[i]=s[j];
                    s[j]=stSort;
                }
            }
        }
    }

    public Student[] updateAgeByName(Student s){
        for(int i=0; i<count ; i++){
            if(listSt[i].getName().equals(s.getName())){
                listSt[i].setAge(s.getAge());
            }
        }
        return listSt;
    }
    public Student[] deleteByName(String s){
        int st[]= new int[count];
        int countD=0;
        for(int i=0;i<count;i++){
            if(s.equals(listSt[i].getName())){
                st[countD]=i;
                countD++;
            }
        }
        for(int i=(countD-1);i>=0;i--){
            for(int j=(st[i]);j<(count-1);j++){
                listSt[j]=listSt[j+1];
            }
        }
        count=count-countD;
        return listSt;
    }
            
    public boolean update(Student s) {
        return false;
    }

    public boolean delete(String name) {
        return false;
    }
}
