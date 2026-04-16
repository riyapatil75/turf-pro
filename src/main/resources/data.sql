INSERT INTO users (fullname, username, password, mobile_no, email, role_id)
VALUES
    ('Aarav Sharma', 'aarav90', 'pass123', '9876543210', 'aarav@example.com', 2),
    ('Diya Patel', 'diya95', 'pass123', '9876543211', 'diya@example.com', 2),
    ('Admin User', 'admin01', 'adminpass', '9999999999', 'admin@example.com', 1);

INSERT INTO turf (turf_name, location, area_in_metres, price_per_hour, sport_type, address, open_time, close_time, description)
VALUES
    ('Green Field Turf', 'https://maps.google.com/greenfield', 1200, 1500, 'Football',
     'Baner Road, Pune', '06:00:00', '22:00:00', 'Premium football turf with LED lights'),

    ('Cricket Arena', 'https://maps.google.com/cricketarena', 1500, 2000, 'Cricket',
     'Hinjewadi, Pune', '07:00:00', '23:00:00', 'Professional cricket pitch with nets'),

    ('Sports Hub', 'https://maps.google.com/sportshub', 1000, 1200, 'Badminton',
     'Wakad, Pune', '08:00:00', '21:00:00', 'Indoor badminton courts');

INSERT INTO booking (booking_date, start_time, end_time, total_amount, user_id, turf_id)
VALUES
    ('2025-07-01', '10:00:00', '11:00:00', 1500, 1, 1),
    ('2025-07-02', '18:00:00', '19:00:00', 2000, 2, 2),
    ('2025-07-03', '09:00:00', '10:00:00', 1200, 1, 3),
    ('2025-07-04', '17:00:00', '18:00:00', 1500, 2, 1);