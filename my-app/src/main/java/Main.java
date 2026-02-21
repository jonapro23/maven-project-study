import br.com.dio.mapper.UserMapper;
import br.com.dio.model.UserModel;
import dto.UserDTO;
import org.mapstruct.factory.Mappers;

import java.time.LocalDate;

public class Main {

    private final static UserMapper mapper = Mappers.getMapper(UserMapper.class);

    public static void main(String[] args) {

        var model = new UserModel();
        model.setCode(1);
        model.setUserName("jonathan");
        model.setBirthday(LocalDate.now().minusYears(15));
        System.out.println(mapper.toDTO(model));


        var dto = new UserDTO();
        dto.setId(2);
        dto.setName("maria");
        dto.setBirthday(LocalDate.now().minusYears(20));
        System.out.println(mapper.toModel(dto));
    }
}
