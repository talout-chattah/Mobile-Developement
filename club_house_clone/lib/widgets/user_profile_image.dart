import 'package:club_house_clone/data.dart';
import 'package:flutter/material.dart';

class UserProfileImage extends StatelessWidget {
  final String imageURL;
  final double size;

  const UserProfileImage({
    Key? key,
    required this.imageURL,
    required this.size,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return ClipRRect(
      borderRadius: BorderRadius.circular(size / 2 - size / 10),
      child: Image.network(
        imageURL,
        width: size,
        height: size,
        fit: BoxFit.cover,
      ),
    );
  }
}
