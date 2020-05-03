package com.chris.tindercyoaengine.model.tinder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

public class TinderMatch implements Serializable {

    Meta meta;
    Data data;

    public static class Meta {
        int status;

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }
    }

    public static class Data {
        List<Match> matches;
        String next_page_token;

        public List<Match> getMatches() {
            return matches;
        }

        public void setMatches(List<Match> matches) {
            this.matches = matches;
        }

        public String getNext_page_token() {
            return next_page_token;
        }

        public void setNext_page_token(String next_page_token) {
            this.next_page_token = next_page_token;
        }
    }

    public static class Match {
        Seen seen;
        String _id;
        String id;
        boolean closed;//": false,
        int common_friend_count;//": 0,
        int common_like_count;//": 0,
        Timestamp created_date;//": "2019-12-25T02:15:42.058Z",
        boolean dead;//": false,
        Timestamp last_activity_date;//": "2019-12-25T02:15:42.058Z",
        int message_count;//": 0,
        List<Message> messages;//":[],
        boolean muted;//": false,
        List<String> participants;//":["584446d660866de109eb32e3"],
        boolean pending;//": false,
        boolean is_super_like;//": false,
        boolean is_boost_match;//": false,
        boolean is_super_boost_match;//": false,
        boolean is_experiences_match;//": false,
        boolean is_fast_match;//": false,
        boolean is_opener;//": false,
        Person person;

        public Seen getSeen() {
            return seen;
        }

        public void setSeen(Seen seen) {
            this.seen = seen;
        }

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public boolean isClosed() {
            return closed;
        }

        public void setClosed(boolean closed) {
            this.closed = closed;
        }

        public int getCommon_friend_count() {
            return common_friend_count;
        }

        public void setCommon_friend_count(int common_friend_count) {
            this.common_friend_count = common_friend_count;
        }

        public int getCommon_like_count() {
            return common_like_count;
        }

        public void setCommon_like_count(int common_like_count) {
            this.common_like_count = common_like_count;
        }

        public Timestamp getCreated_date() {
            return created_date;
        }

        public void setCreated_date(Timestamp created_date) {
            this.created_date = created_date;
        }

        public boolean isDead() {
            return dead;
        }

        public void setDead(boolean dead) {
            this.dead = dead;
        }

        public Timestamp getLast_activity_date() {
            return last_activity_date;
        }

        public void setLast_activity_date(Timestamp last_activity_date) {
            this.last_activity_date = last_activity_date;
        }

        public int getMessage_count() {
            return message_count;
        }

        public void setMessage_count(int message_count) {
            this.message_count = message_count;
        }

        public List<Message> getMessages() {
            return messages;
        }

        public void setMessages(List<Message> messages) {
            this.messages = messages;
        }

        public boolean isMuted() {
            return muted;
        }

        public void setMuted(boolean muted) {
            this.muted = muted;
        }

        public List<String> getParticipants() {
            return participants;
        }

        public void setParticipants(List<String> participants) {
            this.participants = participants;
        }

        public boolean isPending() {
            return pending;
        }

        public void setPending(boolean pending) {
            this.pending = pending;
        }

        public boolean isIs_super_like() {
            return is_super_like;
        }

        public void setIs_super_like(boolean is_super_like) {
            this.is_super_like = is_super_like;
        }

        public boolean isIs_boost_match() {
            return is_boost_match;
        }

        public void setIs_boost_match(boolean is_boost_match) {
            this.is_boost_match = is_boost_match;
        }

        public boolean isIs_super_boost_match() {
            return is_super_boost_match;
        }

        public void setIs_super_boost_match(boolean is_super_boost_match) {
            this.is_super_boost_match = is_super_boost_match;
        }

        public boolean isIs_experiences_match() {
            return is_experiences_match;
        }

        public void setIs_experiences_match(boolean is_experiences_match) {
            this.is_experiences_match = is_experiences_match;
        }

        public boolean isIs_fast_match() {
            return is_fast_match;
        }

        public void setIs_fast_match(boolean is_fast_match) {
            this.is_fast_match = is_fast_match;
        }

        public boolean isIs_opener() {
            return is_opener;
        }

        public void setIs_opener(boolean is_opener) {
            this.is_opener = is_opener;
        }

        public Person getPerson() {
            return person;
        }

        public void setPerson(Person person) {
            this.person = person;
        }
    }

    public static class Seen {
        boolean match_seen;
        String last_seen_msg_id;

        public String getLast_seen_msg_id() {
            return last_seen_msg_id;
        }

        public void setLast_seen_msg_id(String last_seen_msg_id) {
            this.last_seen_msg_id = last_seen_msg_id;
        }

        public boolean isMatch_seen() {
            return match_seen;
        }

        public void setMatch_seen(boolean match_seen) {
            this.match_seen = match_seen;
        }
    }

    @JsonIgnoreProperties(value = { "photos" })
    public static class Person {
        String _id;// "584446d660866de109eb32e3",
        String bio;//
        Timestamp birth_date; //: "1974-05-04T18:05:02.324Z",
        int gender;//: 0,
        String name;//: "Moore",
        Timestamp ping_time;//: "2014-12-09T00:00:00.000Z",
        //TODO maybe make a photos object, idk if it'll be useful
        Map<String, Object> photos;

        public Map<String, Object> getPhotos() {
            return photos;
        }

        public void setPhotos(Map<String, Object> photos) {
            this.photos = photos;
        }

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getBio() {
            return bio;
        }

        public void setBio(String bio) {
            this.bio = bio;
        }

        public Timestamp getBirth_date() {
            return birth_date;
        }

        public void setBirth_date(Timestamp birth_date) {
            this.birth_date = birth_date;
        }

        public int getGender() {
            return gender;
        }

        public void setGender(int gender) {
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Timestamp getPing_time() {
            return ping_time;
        }

        public void setPing_time(Timestamp ping_time) {
            this.ping_time = ping_time;
        }
    }

    public static class Message {
        String _id;//": "5e8493a7b3fa16010023cb73",
        String match_id;//": "53772cdb62997d3c1c363e6c5cc23b34ed804a1500182fe3",
        Timestamp sent_date;//": "2020-04-01T13:14:15.496Z",
        String message;//": "Hey there",
        String to;//: "5cc23b34ed804a1500182fe3",
        String from;//": "53772cdb62997d3c1c363e6c",
        Timestamp timestamp;//": 0

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getMatch_id() {
            return match_id;
        }

        public void setMatch_id(String match_id) {
            this.match_id = match_id;
        }

        public Timestamp getSent_date() {
            return sent_date;
        }

        public void setSent_date(Timestamp sent_date) {
            this.sent_date = sent_date;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getTo() {
            return to;
        }

        public void setTo(String to) {
            this.to = to;
        }

        public String getFrom() {
            return from;
        }

        public void setFrom(String from) {
            this.from = from;
        }

        public Timestamp getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(Timestamp timestamp) {
            this.timestamp = timestamp;
        }
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
