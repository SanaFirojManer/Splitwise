package dev.sana.Splitwise.Mapper;

import dev.sana.Splitwise.DTO.GroupResponseDTO;
import dev.sana.Splitwise.DTO.UserFriendResponseDTO;
import dev.sana.Splitwise.DTO.UserLoginResponseDTO;
import dev.sana.Splitwise.Entity.Group;
import dev.sana.Splitwise.Entity.User;

import java.util.ArrayList;
import java.util.List;

public class EntityDtoMapper {
    public static UserLoginResponseDTO toDTO(User user) {
        UserLoginResponseDTO userLoginResponseDTO = new UserLoginResponseDTO();
        userLoginResponseDTO.setId(user.getId());
        userLoginResponseDTO.setName(user.getName());
        userLoginResponseDTO.setEmail(user.getEmail());
        // return userLoginResponseDTO;
        //conversion user friends to friendlist

        List<UserFriendResponseDTO> friendList = new ArrayList<>();
        if (user.getFriends() != null) {
            for (User friend : user.getFriends()) {
                friendList.add(toFriendDTO(friend));
            }
            userLoginResponseDTO.setFriendList(friendList);
        }

        if(user.getGroups() != null) {
            //conversion of group to groupResponseDTO
            List<GroupResponseDTO> groups = new ArrayList<>();
            for (Group group : user.getGroups()) {
                groups.add(toDTO(group));
            }
            userLoginResponseDTO.setGroups(groups);

        }
        return userLoginResponseDTO;

    }

    public static UserFriendResponseDTO toFriendDTO(User user){
        UserFriendResponseDTO responseDTO = new UserFriendResponseDTO();
        responseDTO.setId(user.getId());
        responseDTO.setName(user.getName());
        return responseDTO;
    }

    public static GroupResponseDTO toDTO(Group group){
        return null;
    }
}
