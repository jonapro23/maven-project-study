package br.com.dio.mapper;

import br.com.dio.model.UserModel;
import dto.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface UserMapper {
    //target = indicar alvo(target = indicate target)
    //source = origem(source = origin)
    @Mapping(target = "code", source = "id" )
    @Mapping(target = "userName", source = "name" )
    UserModel toModel(final UserDTO dto);

    @Mapping(target = "id", source = "code" )
    @Mapping(target = "name", source = "userName" )
    UserDTO toDTO(final UserModel model);

}
