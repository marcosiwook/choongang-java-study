package customer;

public class CustomServiceImpl { // Business Model 업무처리
    private static CustomerDaoImpl cdi = new CustomerDaoImpl();

    public int insert(Customer customer) {
        int result = 0; // 0은 입력실패, 1은 입력성공
        //   map에 전달된 id를 가지고 읽어서 있으면 이미 있는 아이디입니다. 다른 것을 사용하세요, 없으면 입력
        // customer는 console로 입력 받아서 전달 받은 데이터, customer2는 map에서 읽어온 데이터
        Customer customer2 = cdi.select(customer.getId()); // 입력한 id로 읽기
        if(customer2 == null) result = cdi.insert(customer);
        else System.out.println("이미 있는 아이디입니다. 다른 것을 사용하세요");
        return result;
    }

    public Customer select(String id) {
        return cdi.select(id);
    }

    public int update(Customer customer) {
        int result = 0; // 0은 입력실패, 1은 입력성공
        //   map에 전달된 id를 가지고 읽어서 있으면 이미 있는 아이디입니다. 다른 것을 사용하세요, 없으면 입력
        // customer는 console로 입력 받아서 전달 받은 데이터, customer2는 map에서 읽어온 데이터
        Customer customer2 = cdi.select(customer.getId()); // 입력한 id로 읽기
        if(customer2 != null) result = cdi.update(customer);
        else System.out.println("없는데이터는 수정 못합니다.");
        return result;
    }}
