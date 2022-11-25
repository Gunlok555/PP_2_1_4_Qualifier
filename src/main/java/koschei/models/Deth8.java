package koschei.models;

import org.springframework.stereotype.Component;

@Component
public class Deth8 {

}
// прошу по возможности объясните! я понимаю, что тут возвращается toString у методов друг за дружкой, но
//почему не получилось сделать через аннотации @Autowired и @Qualifier в каждом классе,
// ведь @Qualifier играет своего рода роль ключа, указывал его в конструкторе, создалась своего рода очередность обращения и
// по логике должно было заработать, но пристала зараза "NoSuchBeanDefinitionException"