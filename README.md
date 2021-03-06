RateDocs -- Yelp for Doctors!
==========================

## Features

- Enables users to browse doctor profiles in the nearby vicinity

- Allows users to view the ratings and reviews of doctors as well as share their own experience

- Provides emergency doctor contact lists even when there's no internet connection

## Data Layout

####Doctor Profiles

| Field       | Type   | Default  |
| :---------: | :-----:| :------:|
| Profile Picture| png/jpg/jpeg |  noimage.jpeg     |
| First Name       | String |      |
| Last Name       | String |     |
| Email       | String |       |
| Phone       | String |       |
| Address       | String |       |
| Longitude       | Double |       |
| Latitude       | Double |       |
| Rating       | `List<Integer> `|       |
| Comments       | `List<String>` |       |

####User

| Field       | Type   | Default  |
| :---------: | :-----:| :------:|
| Username       | String |     |
| Email       | String |       |
| Password       | String |       |

## Technology Set

- **Language**: Java

- **Design Pattern**: Model-View-Presenter

- **Database**: [Parse](https://parse.com/), SQLite

## Support  

Please contact zac.li.cmu@gmail.com for more information about this project.

## License

04/29/2014
